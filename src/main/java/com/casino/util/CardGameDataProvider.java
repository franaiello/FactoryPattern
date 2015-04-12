package com.casino.util;

import com.casino.CardGame;
import com.casino.ICardGame;
import org.testng.annotations.DataProvider;

public class CardGameDataProvider {
    private static String BLACKJACK = "BlackJack";
    private static String POKER = "Poker";

    @DataProvider(name = "BlackJack")
    public static Object[][] blackJack() {
        ICardGame blackJack = CardGame.createCardGame(CardGame.GameType.BlackJack);

        return new Object[][]{
                new Object[]{blackJack, BLACKJACK}
        };
    }

    @DataProvider(name = "Poker")
    public static Object[][] poker() {
        ICardGame poker = CardGame.createCardGame(CardGame.GameType.Poker);

        return new Object[][]{
                new Object[]{poker, POKER}
        };
    }
}
