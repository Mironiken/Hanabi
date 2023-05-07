package com.hanabi.data;

import java.util.*;

public class PlayerCards {
    private final Queue<Card> cards = new ArrayDeque<>();

    public PlayerCards(List<Card> cards) {
        this.cards.addAll(cards);
    }

    public PlayerCards(int cardsNum) {
        for (int i = 0; i < cardsNum; i++) {
            cards.add(Card.uncertain());
        }
    }

    public Collection<Card> getCards() {
        return Collections.unmodifiableCollection(cards);
    }
}
