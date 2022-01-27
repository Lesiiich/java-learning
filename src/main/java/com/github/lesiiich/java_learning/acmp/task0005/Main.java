package com.github.lesiiich.java_learning.acmp.task0005;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int[] array = new int[n];
        int ch = 0;
        int nch = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
            if (array[i] % 2 != 0) {
                out.print(array[i] + " ");
                nch += array[i];
            }
        }
        out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                out.print(array[i] + " ");
                ch += array[i];
            }
        }
        out.println();
        if (ch >= nch) {
            out.print("YES");
        } else {
            out.print("NO");
        }
        out.flush();
    }
}
