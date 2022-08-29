package ru.job4j.arrays;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";

        for (int i = 0; i < columnCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (i == 0 || i == columnCount - 1) {
                    System.out.print(star);
                } else {
                    if (i == j || j == columnCount - 1 - i) {
                        System.out.print(star);
                    } else if (j < i || j < columnCount - i) {
                        System.out.print(space);
                    }
                }
            }
            if (i < columnCount - 1) {
                System.out.println();
            }
        }

//        for (int i = 0; i < columnCount; i++) {
//            if (i < columnCount / 2) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <= columnCount - 2 * i; j++) {
//                    System.out.print("*");
//                }
//            } else {
//                for (int j = 1; j <= columnCount - i - 1; j++) {
//                    System.out.print(" ");
//                }
//                for (int j = 1; j <= 2 * (i - columnCount / 2) + 1; j++) {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
    }
}