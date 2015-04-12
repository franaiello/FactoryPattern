package com.casino.impl;

import com.casino.ICardGame;

public class BlackJackGame implements ICardGame {
    @Override
    public String deal() {
        return "I'm dealing a BlackJack game";
    }

    @Override
    public String shuffle() {
        return "I'm shuffling a BlackJack game";
    }
}
