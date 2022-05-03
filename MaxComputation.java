package com.bridgelabz.assignment13;

public class MaxComputation {

    //    method to find max of given elements
    public static void findMax(Integer firstNum, Integer secondNum, Integer thirdNum) {
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

    public static void main(String[] args) {

        System.out.println("----- Computing Maximum Of Three Numbers using Java Generics ------\n");
        Integer firstNum = 15, secondNum = 86, thirdNum =980 ;
        findMax(firstNum, secondNum, thirdNum);
    }
}