package io.btime.palavraprima.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrimeWordUnitTest {

    //Use some prime word with known number sum
    private static final String WORD = "Robson";
    private static final int WORD_NUMBER = 109;

    @Test
    public void wordNumberIsCorrect() {

        Word word = new Word();
        word.setWord(WORD);
        assertEquals(WORD_NUMBER, word.toNumber());

    }

    @Test
    public void wordIsPrime() {

        Word word = new Word();
        word.setWord(WORD);
        assertEquals(true, word.isPrime());

    }

}