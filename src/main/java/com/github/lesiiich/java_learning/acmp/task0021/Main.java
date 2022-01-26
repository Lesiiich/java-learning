package com.github.lesiiich.java_learning.acmp.task0021;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int s1 = Math.abs(a - b);
        int s2 = Math.abs(a - c);
        int s3 = Math.abs(c - b);
        if (s1 > s2 && s1>s3) {
            System.out.print(s1);
        } else if (s2 > s1 && s2>s3) {
            System.out.print(s2);
        } else {
            System.out.print(s3);
        };
        out.flush();
    }
}
