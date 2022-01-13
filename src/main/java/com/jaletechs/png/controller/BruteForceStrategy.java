package com.jaletechs.png.controller;

import com.jaletechs.png.model.GenerationResponse;
import com.jaletechs.png.util.PNGUtil;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by jaletechs on 2019-05-30.
 *
 * This strategy uses brute force to find the prime numbers in a range provided by the user.
 */
public class BruteForceStrategy implements GenerationStrategy {

    @Override
    public GenerationResponse generate(int start, int end) {
        System.out.println("***** BRUTE FORCE *****");
        Instant startTime = Instant.now();
        int count = 0;
        StringBuilder builder = new StringBuilder();
        for (int i = start; i < end; i++) {
            if (PNGUtil.isPrime(i)) {
                builder.append(i).append(", ");
                count++;
            }
        }

        Instant endTime = Instant.now();

        GenerationResponse response = new GenerationResponse();
        response.setPrimeNumbers(builder.toString());
        response.setNumberOfPrimes(count);
        response.setTimeElapsed(Duration.between(startTime, endTime).toMillis());

        return response;
    }
}
