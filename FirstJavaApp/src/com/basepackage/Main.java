package com.basepackage;

import java.util.*;
import java.awt.*;
import java.text.NumberFormat;

public class Main {
    
    public static void main(String[] args) {
        // PRIMITIVE TYPES
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        double accuracy = 0.9984928401;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        // REFERENCE TYPES 
        Date now = new Date();
        Point point1 = new Point(1, 1);
        Point point2 = point1; // reference change as orgininal changes

        // STRING VARIABLES
        // Strings are immuatable
        String message = "\"Hello\" World" + "!!";
        // String methods
        message.length();
        message.startsWith("H");
        message.indexOf("e");
        message.replace("!", "*");
        message.toUpperCase();
        message.trim(); // removes whitespace from start and end

        // ARRAYS
        int[] numbers = {2, 3, 5, 1, 4};
        //numbers.length;
        Arrays.sort(numbers);
        //System.out.println(Arrays.toString(numbers));

        // MULTI-DIMENSIONAL ARRAYS
        int[][] matrix = { {1, 2, 3}, {4, 5, 6} }; //creates a 2x3 matrix
        // OR int[][] matrix = new int[2][3];
        // matrix[0][0] = 1; // (and so on)
        //System.out.println(Arrays.deepToString(matrix));

        // CONSTANTS
        final float pi = 3.14F;
        // treats pi as a constant so cannot change it later on

        // ARITHMETIC EXPRESSIONS
        double result = (double)10 / (double)3;

        // CASTING
        // Implicit casting
        // byte > short > int > long > float > double

        // Explicit casting
        String z = "1";
        double x = 1.1;
        int y = (int)x + Integer.parseInt(z); // y = 2

        //MATH CLASS
        int result0 = Math.round(1.1F);
        int result1 = (int)Math.ceil(1.1F);
        int result2 = (int)Math.floor(1.9F);
        int result3 = Math.max(1, 2);
        double result4 = Math.random(); // 0.0 to 1.0

        // FORMATTING NUMBERS
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result5 = currency.format(1234567.891);

        String result6 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result6);

        // USER INPUT
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte inputAge = scanner.nextByte();
        System.out.println("You are " + inputAge);
    }
}
