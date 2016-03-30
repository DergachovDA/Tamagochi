package ua.in.dergachovda;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Chicken chicken = new Chicken("Chip");

        System.out.println("Hi. My name is " + chicken.name + ".");
        System.out.println(chicken);
        System.out.println("to take help, type \"help\"");

        HashSet <String> commands = new HashSet<String>();
        commands.add("help");
        commands.add("show");
        commands.add("exit");
        commands.add("feed");
        commands.add("doc");
        commands.add("game");


        while (true) {
            System.out.println("Enter the command:");
            String command = reader.readLine();

            if (commands.contains(command)) {

                if (command.equals("help")) {
                    System.out.println("help - Help");
                    System.out.println("show - Show chicken");
                    System.out.println("exit - Exit");
                    System.out.println("feed - Feed the chicken");
                    System.out.println("doc - Doctor the chicken");
                    System.out.println("game - Game elevates mood");
                    chicken.lifetime();
                }

                if (command.equals("show")) {
                    chicken.lifetime();
                    System.out.println(chicken);
                }

                if (command.equals("feed")) {
                    chicken.feed();
                    System.out.println(chicken);
                }

                if (command.equals("doc")) {
                    chicken.doctor();
                    System.out.println(chicken);
                }

                if (command.equals("game")) {
                    chicken.game();
                    System.out.println(chicken);
                }

                if (command.equals("exit"))
                    System.exit(0);

            }
            else
                System.out.println("error");
       }

    }
}