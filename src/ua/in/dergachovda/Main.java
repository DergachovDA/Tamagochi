package ua.in.dergachovda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Chicken chicken = new Chicken("Chip");

        System.out.println("Hi. My name is " + chicken.name + ".");
        System.out.println(chicken);
        System.out.println("to take help, type \"help\"");

        while (true) {
            System.out.println("Enter the command:");
            String command = scanner.next();
            switch (command) {
                case "help":
                    System.out.println("help - Help");
                    System.out.println("show - Show chicken");
                    System.out.println("exit - Exit");
                    System.out.println("feed - Feed the chicken");
                    System.out.println("doc - Doctor the chicken");
                    System.out.println("game - Game elevates mood");
                    chicken.lifetime();
                    break;
                case "show":
                    chicken.lifetime();
                    System.out.println(chicken);
                    break;
                case "feed":
                    chicken.feed();
                    System.out.println(chicken);
                    break;
                case "doc":
                    chicken.doctor();
                    System.out.println(chicken);
                    break;
                case "game":
                    chicken.game();
                    System.out.println(chicken);
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("error");
            }
        }
    }
}