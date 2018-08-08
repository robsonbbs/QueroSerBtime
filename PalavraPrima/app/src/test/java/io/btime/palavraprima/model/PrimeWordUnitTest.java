package io.btime.palavraprima.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrimeWordUnitTest {


    //Prime word, correct number
    private static final String WORD = "Robson";
    private static final int WORD_NUMBER = 109;

    //Prime word, not correct number
    /*private static final String WORD = "Robson";
    private static final int WORD_NUMBER = 115;*/

    //Not prime word, correct number
   /* private static final String WORD = "Mauro";
    private static final int WORD_NUMBER = 94;*/

    //Not prime word, not correct number
    /*private static final String WORD = "Mauro";
    private static final int WORD_NUMBER = 100;*/

    /*//Extense word
    private static final String WORD = "Pneumonoultramicroscopicsilicovolcanoconiosis";
    private static final int WORD_NUMBER = 586;*/

    //Input with space
    /*private static final String WORD = "Robson Barreto";
    private static final int WORD_NUMBER = 214;*/

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