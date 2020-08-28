package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        boolean isRunning = true;
        Scanner console = new Scanner(System.in);
        ArrayList jokes = List();
        //String[] jokes = {"Hvorfor blev blondinen glad for at samle et pusslespil på 6 måneder? Fordi der stod 2-4 år", "My new thesaurus is terrible. In fact, it's so bad, I'd say it's terrible.", "How are false teeth like stars? They come out at night!", "Why are skeletons so calm? Because nothing gets under their skin.", "I got fired from a florist, apparently I took too many leaves.", "Q: What’s 50 Cent’s name in Zimbabwe? A: 200 Dollars."};


        Random r = new Random();
        int randomNumber = r.nextInt(jokes.size());


        while (isRunning) {
            String input = console.nextLine();
            if (input != null) {
                System.out.println(jokes.get(randomNumber));
                randomNumber = r.nextInt(jokes.size());
            }
        }
    }
    public static ArrayList List() throws FileNotFoundException {
        ArrayList<String> jokelist = new ArrayList<>();
        Scanner scan = new Scanner(new File("C:/Users/peter/OneDrive/Documents/GitHub/JOKR/src/com/company/Jokes.txt"));
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            jokelist.add(line);
        }
        return jokelist;
    }
}