package com.company;

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball {

    public static void main(String[] args)
    {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        String[] responses = {"Yes","No","Maybe","Ask again later"};

        System.out.println("What's your question?");
        String quest = sc.nextLine();

        int randomResponseIndex = rand.nextInt(responses.length);

        String response = responses[randomResponseIndex];

        System.out.println();
        System.out.println(response);
        System.out.println();
    }
}



