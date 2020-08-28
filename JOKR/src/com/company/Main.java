package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Version 1.");
        System.out.println("Hvad sagde blondinen, da hun gik ind i bussen?.. Av!");


        System.out.println("Version 2.");

        ArrayList<String> list = new ArrayList<String>();
        String joke1 = "Hvad sagde Indiana Jones, da han skulle købe en bil?.. Harison Ford";
        String joke2 = "Hvad kalder man et kriminelt får?.. En fårbryder";
        String joke3 = "Hvad kalder man to kriminelle lamaer?.. Balademaer";
        String joke4 = "Hvor mange babyer skal der til at male et hus? Det kommer an på hvor hårdt du kaster";
        String joke5 = "Det ene skilt til det andet: Er du gift? Nej, jeg er skilt";
        String joke6 = "Hvorfor stod der 17 blondiner foran natklubben?.. Man skulle være 18 for at komme ind";
        String joke7 = "Hvad sagde blondinen, da hun gik ind i bussen?.. Av!";

        list.add(joke1);
        list.add(joke2);
        list.add(joke3);
        list.add(joke4);
        list.add(joke5);
        list.add(joke6);
        list.add(joke7);

        Scanner console = new Scanner(System.in);
        int i = 0;
        boolean isRunning = true;
        while(i <= 6){
            System.out.println(list.get(i));
            console.nextLine();
            i++;
        }
    }
}
