package com.hanabi.data;

import com.hanabi.utils.Constants;

import java.util.*;

public class DrawPile {
    public Deque<Card> pile;

    private DrawPile(ArrayDeque<Card> cards) {
        this.pile = cards;
    }

    public static DrawPile generate() {
        return generate(Constants.standardRules);
    }

    public static DrawPile generate(List<Integer> pileRules) {
        List<Card> drawPile = new ArrayList<>();
        for (Color value : Color.values()) {
            for (int i = 0; i < pileRules.size(); i++) {
                for (int j = 0; j < pileRules.get(i); j++) {
                    drawPile.add(Card.of(value, i + 1));
                }
            }
        }
        Collections.shuffle(drawPile);
        return new DrawPile(new ArrayDeque<>(drawPile));
    }

    public void draw(Card card) {
        pile.remove(card);
    }

    public void draw(Collection<Card> cards) {
        cards.forEach(card -> draw(card));
    }

    public List<Card> draw() {
        return draw(1);
    }

    public List<Card> draw(Integer numCards) {
        List<Card> draw = new ArrayList<Card>();

        // Take a certain number of cards from the top of the deck
        for (int i = 0; i < numCards; i++) {
            draw.add(pile.pop());
        }

        return draw;
    }

    public Integer leftDeck() {
        return pile.size();
    }
}
