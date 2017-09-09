package com.realdolmen.education.jav710.exercise6;

import java.math.BigInteger;

public class BigIntegerOverflowRunner {
    public static void main(String[] args) {
        BigInteger value = new BigInteger("0");
        while(true) {
            value = value.add(new BigInteger("1"));
            System.out.println(value);
        }
    }
}
