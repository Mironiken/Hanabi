package com.hanabi;

import com.hanabi.data.*;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final DrawPile drawPile;
    private DiscradPile discradPile;
    private ResultPile resultPile;
    private List<PlayerCards> otherPlayersCards;
    private PlayerUncertainCards myCards;

    public Game(List<PlayerCards> playersCards) {
        drawPile = DrawPile.generate();
        discradPile = new DiscradPile();
        resultPile = new ResultPile();
        otherPlayersCards = playersCards;
        myCards = new PlayerUncertainCards(playersCards.get(0).getCards().size());
        playersCards.forEach(playerCards -> drawPile.draw(playerCards.getCards()));
    }

    public DrawPile getDrawPile() {
        return drawPile;
    }
}
