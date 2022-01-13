package com.jaletechs.png.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by jaletechs on 2019-05-29.
 */
public class PNGUtilTest {

    @Test
    public void testIsPrimeNumber() {
        Assert.assertTrue(PNGUtil.isPrime(3));
        Assert.assertTrue(PNGUtil.isPrime(11));
        Assert.assertTrue(PNGUtil.isPrime(101));
        Assert.assertFalse(PNGUtil.isPrime(4));
    }

    @Test
    public void testOptimizedIsPrimeNumber() {
        Assert.assertTrue(PNGUtil.optimizedIsPrime(3));
        Assert.assertTrue(PNGUtil.optimizedIsPrime(11));
        Assert.assertTrue(PNGUtil.optimizedIsPrime(101));
        Assert.assertFalse(PNGUtil.optimizedIsPrime(4));
    }

    @Test
    public void testPartitions() {
        Assert.assertTrue(PNGUtil.partitions(0,100,10).size() == 10);
    }

} 
