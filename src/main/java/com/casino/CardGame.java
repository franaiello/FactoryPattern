package com.casino;

import com.casino.impl.BlackJackGame;
import com.casino.impl.PokerGame;

public class CardGame {
    public static ICardGame createCardGame(GameType type) {
        if(type == GameType.Poker) {
            return new PokerGame();
        } else if (type == GameType.BlackJack) {
            return new BlackJackGame();
        }
        return null;
    }

    public enum GameType {
        Poker("Poker"),
        BlackJack("BlackJack");

        private String game;

        GameType(String game) {
            this.game = game;
        }
    }
}
