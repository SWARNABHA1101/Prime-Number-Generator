package com.jaletechs.png.model;

/**
 * Created by jaletechs on 2019-06-03.
 */
public class GenerationResponse {

    private String primeNumbers;
    private int numberOfPrimes;
    private long timeElapsed;

    public GenerationResponse () {}

    public GenerationResponse(String primeNumbers, int numberOfPrimes) {
        this.primeNumbers = primeNumbers;
        this.numberOfPrimes = numberOfPrimes;
    }

    public String getPrimeNumbers() {
        return primeNumbers;
    }

    public void setPrimeNumbers(String primeNumbers) {
        this.primeNumbers = primeNumbers;
    }

    public int getNumberOfPrimes() {
        return numberOfPrimes;
    }

    public void setNumberOfPrimes(int numberOfPrimes) {
        this.numberOfPrimes = numberOfPrimes;
    }

    public long getTimeElapsed() {
        return timeElapsed;
    }

    public void setTimeElapsed(long timeElapsed) {
        this.timeElapsed = timeElapsed;
    }

    @Override
    public String toString() {
        return "GenerationResponse{" +
                "primeNumbers='" + primeNumbers + '\'' +
                ", numberOfPrimes=" + numberOfPrimes +
                '}';
    }
}
