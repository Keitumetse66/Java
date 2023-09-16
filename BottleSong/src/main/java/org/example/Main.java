package org.example;

public class Main {
    public static void main(String[] args) {
        int bootleNum = 10;
        String word = "bottles";

        while (bootleNum > 0) {
            if (bootleNum == 1) {
                word = "bottle";
            } else {
                for(int i = 1; i <= 2; i++) {
                    System.out.println(bootleNum + " green " + word + ", hanging on the wall.");
                }
            }
            System.out.println("And if one green bottle should accidentally fall,");
            bootleNum--;

            if (bootleNum > 0) {
                System.out.println("There'll be "+ bootleNum + " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall.");
            }
        }
    }
}