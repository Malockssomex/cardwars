package cw;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Seed: ");
        Random rng = new Random(sc.nextLong());
        boolean isPlayer2Turn;

        System.out.println(rng.nextInt(0,59));
        System.out.println(rng.nextInt(0,58));
        System.out.println(rng.nextInt(0,57));
        System.out.println(rng.nextInt(0,56));
        System.out.println(rng.nextInt(0,55));

        sc.close();
    }
}