package com.strategy;

import java.util.Scanner;

// https://www.codechef.com/SSC72021/problems/SSEC0014
public class SSEC0014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String adityaArray[] = sc.nextLine().split(" ");
        String arvindArray[] = sc.nextLine().split(" ");
        int aditya = 0;
        int arvind = 0;

        for (int i = 0; i < 3; i++) {
            if (Integer.parseInt(adityaArray[i]) > Integer.parseInt(arvindArray[i])) {
                aditya++;
            } else if (Integer.parseInt(adityaArray[i]) < Integer.parseInt(arvindArray[i])) {
                arvind++;
            }
        }
        System.out.println(aditya + " " + arvind);
    }
}
