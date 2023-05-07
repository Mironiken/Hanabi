package com.hanabi.data;

import java.util.Objects;

public class Card {
    public Color color;
    public Integer denomination;

    private Card(Color color, Integer denomination) {
        this.color = color;
        this.denomination = denomination;
    }

    private Card() {}

    public static Card of(Color color, Integer denomination) {
        return new Card(color, denomination);
    }

    public static Card uncertain() {
        return new Card();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return color == card.color && Objects.equals(denomination, card.denomination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, denomination);
    }
}
