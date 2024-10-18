package cw;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static boolean isPlayer2Turn;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Seed: ");
        Random rng = new Random(sc.nextLong());
        isPlayer2Turn = false;
        Landscape[][] board = new Landscape[2][4];
        

        sc.close();
    }

}