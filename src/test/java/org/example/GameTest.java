package org.example;

import com.hanabi.Game;
import com.hanabi.data.Card;
import com.hanabi.data.Color;
import com.hanabi.data.DrawPile;
import com.hanabi.data.PlayerCards;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class GameTest {

    @Test
    public void setupGame() {
        DrawPile pile = DrawPile.generate();
        Game simpleGame = new Game(Collections.singletonList(new PlayerCards(Collections.singletonList(Card.of(Color.WHITE, 1)))));
        Assert.assertEquals(pile.leftDeck() - 1, (long) simpleGame.getDrawPile().leftDeck());
    }
}
