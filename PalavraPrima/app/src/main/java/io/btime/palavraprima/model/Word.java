package io.btime.palavraprima.model;

import java.math.BigInteger;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;

import io.btime.palavraprima.util.Constants;

public class Word {
    private String word;

    public void setWord(String word) {
        //Normalize word to remove accents
        this.word = Normalizer.normalize(word, Normalizer.Form.NFD);
    }

    //Convert this word to number based on ALPHABET constant array
    public int toNumber() {
        int number = 0;

        List<String> alphabetList = Arrays.asList(Constants.ALPHABET);

        //Increase number with constant value from current letter
        for (int i = 0; i < word.length(); i++) {
            String currentLetter = String.valueOf(word.charAt(i));
            number += alphabetList.indexOf(currentLetter) + 1;
        }

        return number;
    }

    //Check if number is prime
    public boolean isPrime() {
        BigInteger bigInteger = new BigInteger(String.valueOf(toNumber()));
        return bigInteger.isProbablePrime(1);
    }
}
