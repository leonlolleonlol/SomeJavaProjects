package ca.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner numberObjets = new Scanner(System.in);
            System.out.println("Enter the amount of balls to be created:");
            int nbObjects = Math.max(Math.min(numberObjets.nextInt(),10000),2);
            Ball[] balls = new Ball[nbObjects];
            for (int i = 0; i < nbObjects; i++) {
                balls[i] = new Ball(i + 1);
            }
            showmenu(balls);
        } catch (NumberFormatException e) {
            System.out.println("You didn't enter a valid response");
        }
    }

    public static void showmenu(Ball[] balls) throws NumberFormatException{
        System.out.println("Choose your interests:");
        System.out.println("1. Diameter");
        System.out.println("2. Name");
        System.out.println("3. Color");
        System.out.println("4. Price");
        System.out.println("5. TagNumber");
        choose(balls);
    }

    public static void choose(Ball[] balls) throws NumberFormatException{
        try {
            Scanner input = new Scanner(System.in);
            int answer = 0;
            while (answer < 1 || answer > 5) {
                System.out.println("Enter a valid number from 1 to 5:");
                Scanner scanner = new Scanner(System.in);
                answer = scanner.nextInt();
            }
            ArrayList<Ball> results = new ArrayList<>();
            if (answer != 5) {
                if (answer != 4) {
                    System.out.println("What are you looking for?");
                    String choice = input.nextLine();
                    for (Ball ball : balls) {
                        if (ball.getInfo()[answer - 1].equals(choice))
                            results.add(ball);
                    }
                } else {
                    System.out.println("Choose your minimum amount (even number):");
                    int min = input.nextInt();
                    System.out.println("Choose your maximum amount (even number):");
                    int max = input.nextInt();
                    for (Ball ball : balls) {
                        if (ball.getPrice() >= min && ball.getPrice() <= max)
                            results.add(ball);
                    }
                }
            } else {
                System.out.println("What are you looking for?");
                String choice = input.nextLine();
                results.add(balls[Integer.parseInt(choice) - 1]);
            }
            if (results.isEmpty()) {
                System.out.println("No results found!");
            } else {
                for (Ball result : results) {
                    System.out.println(result);
                }
                System.out.println(results.size() + " results found!");
            }
        }
            catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The desired option doesn't respect the arrays bound");
        }
    }
}
