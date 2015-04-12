package com.casino;

import com.casino.util.CardGameDataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardGameTest {

    @Test(dataProviderClass = CardGameDataProvider.class,
            dataProvider = "Poker")
    public void dealPoker(ICardGame cardGame, String result) {
        assertThat(cardGame.deal()).containsIgnoringCase(result);
    }

    @Test(dataProviderClass = CardGameDataProvider.class,
            dataProvider = "Poker")
    public void shufflePokerHand(ICardGame cardGame, String result) {
        assertThat(cardGame.shuffle()).containsIgnoringCase(result);
    }

    @Test(dataProviderClass = CardGameDataProvider.class,
            dataProvider = "BlackJack")
    public void dealBlackJack(ICardGame cardGame, String result) {
        assertThat(cardGame.deal()).containsIgnoringCase(result);
    }

    @Test(dataProviderClass = CardGameDataProvider.class,
            dataProvider = "BlackJack")
    public void shuffleBlackJackHand(ICardGame cardGame, String result) {
        assertThat(cardGame.shuffle()).containsIgnoringCase(result);
    }


}
