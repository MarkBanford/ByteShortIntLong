package com.mbl;

public class Main {

    public static void main(String[] args) {
        System.out.println("Size of byte: " + (Byte.SIZE / 8) + " bytes.");
        System.out.println("Size of short: " + (Short.SIZE / 8) + " bytes.");
        System.out.println("Size of int: " + (Integer.SIZE / 8) + " bytes.");
        System.out.println("Size of long: " + (Long.SIZE / 8) + " bytes.");
        System.out.println("Size of char: " + (Character.SIZE / 8) + " bytes.");
        System.out.println("Size of float: " + (Float.SIZE / 8) + " bytes.");
        System.out.println("Size of double: " + (Double.SIZE / 8) + " bytes.");

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        Long minLong = Long.MIN_VALUE;
        Long maxLong = Long.MAX_VALUE;
        System.out.println("Min Int Value is " + minInt);
        System.out.println("Max Int Value is " + maxInt);
        System.out.println("Min Long Value is " + minLong);
        System.out.println("Max Long Value is " + maxLong);
        System.out.println("Busted Max Value =" + (maxInt + 1));
    }
}
