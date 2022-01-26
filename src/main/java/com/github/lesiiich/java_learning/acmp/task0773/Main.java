package com.github.lesiiich.java_learning.acmp.task0773;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int k = in.nextInt();
        int m = in.nextInt();
        int c = k*k*m;
        out.print(c);
        out.flush();
    }
}
