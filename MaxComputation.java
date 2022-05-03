package com.bridgelabz.assignment13;

import org.jetbrains.annotations.NotNull;

public class MaxComputation {

    //    method to find max of given elements(Integer)
    public static void findMax(@NotNull Integer firstNum, Integer secondNum, Integer thirdNum) {
        Integer maxNum;

        if (firstNum.compareTo(secondNum) > 0 && firstNum.compareTo(thirdNum) > 0) {
            maxNum = firstNum;
        } else if (secondNum.compareTo(firstNum) > 0 && secondNum.compareTo(thirdNum) > 0) {
            maxNum = secondNum;
        } else {
            maxNum = thirdNum;
        }

        System.out.println("The maximum Integer is: " + maxNum);
    }
    //    method to find max of given elements(Float)
    public static void findMax(@NotNull Float firstNum, Float secondNum, Float thirdNum) {
        Float maxNum;

        if (firstNum.compareTo(secondNum) > 0 && firstNum.compareTo(thirdNum) > 0) {
            maxNum = firstNum;
        } else if (secondNum.compareTo(firstNum) > 0 && secondNum.compareTo(thirdNum) > 0) {
            maxNum = secondNum;
        } else {
            maxNum = thirdNum;
        }

        System.out.println("The maximum float is: " + maxNum);
    }

    public static void main(String[] args) {

        System.out.println("----- Computing Maximum Of Three Numbers using Java Generics ------\n");
        Integer firstNum = 15, secondNum = 86, thirdNum = 980;
        findMax(firstNum, secondNum, thirdNum);
        Float numFirst = 12.540f, numSecond = 8.649f, numThird = 7.693589f;
        findMax(numFirst, numSecond, numThird);
    }
}