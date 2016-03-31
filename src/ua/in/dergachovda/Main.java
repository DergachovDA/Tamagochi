package ua.in.dergachovda;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Chicken chicken = new Chicken(args[0]);

        System.out.println(chicken.avatar + " Hi. My name is " + chicken.name + ".");
        System.out.println("to take help, type \"help\"\n");

        while (true) {
            System.out.println("\nEnter the command:");
            String command = scanner.next();
            chicken.lifetime();
            switch (command) {
                case "help":
                    System.out.println("help - Help");
                    System.out.println("show - Show chicken");
                    System.out.println("feed - Feed the chicken");
                    System.out.println("doc  - Doctor the chicken");
                    System.out.println("game - Game elevates mood");
                    System.out.println("exit - Exit\n");
                    break;
                case "show":
//                    chicken.lifetime();
                    break;
                case "feed":
                    chicken.feed();
                    break;
                case "doc":
                    chicken.doctor();
                    break;
                case "game":
                    chicken.game();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("error\n");
            }
            System.out.println(chicken);
        }
    }
}