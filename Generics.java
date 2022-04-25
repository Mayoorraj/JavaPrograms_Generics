package com.bridgelabz.assignment13;

public class Generics {
    private static void toPrint(Integer[] inputArray) {
        System.out.print("Integer Array : ");
        for (int i = 0; i < inputArray.length; i++) {
            System.out.print(inputArray[i] + " ");
        }
        System.out.println();
    }

    // Printing Double Array
    private static void toPrint(Double[] inputArray) {
        System.out.print("Double Array : ");
        for (double element : inputArray) {
            System.out.printf(element + "  ");
        }
        System.out.println();g
    }

    // Printing Character Array
    private static void toPrint(Character[] inputArray) {
        System.out.print("Charater Array : ");
        for (char element : inputArray) {
            System.out.printf("%s", element);
        }
    }

    public static void main(String[] args) {
        System.out.println("------------------- Generic demo -------------------- \n");
        // Array initialization
        Integer[] intArray = {2, 4, 6, 8, 10};
        Double[] doubleArray = {1.1, 3.3, 5.5, 7.7};
        Character[] charArray = {'G', 'E', 'N', 'E', 'R', 'I', 'C', 'S'};

        // Print Array
        toPrint(intArray);
        toPrint(doubleArray);
        toPrint(charArray);
    }
}