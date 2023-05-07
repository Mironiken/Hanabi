package com.hanabi.data;

import java.util.ArrayList;
import java.util.List;

public class PlayerUncertainCards extends PlayerCards {
    public List<CardAdditionalInfo> cardsAdditionalInfo;

    public PlayerUncertainCards(int cardsNum) {
        super(cardsNum);
    }
}
