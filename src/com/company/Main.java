package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        personne NewPersonne1 = new personne();
        System.out.println("Donner Cin");
        NewPersonne1.setCin(sc.nextInt());
        System.out.println("Donner Nom");
        NewPersonne1.setNom(sc.next());
        System.out.println("Donner Age");
        int age = sc.nextInt();
        NewPersonne1.setAge(age);
        personne NewPersonne2 = new personne(123,"wissem",23);
        System.out.println(NewPersonne1.toString());
        System.out.println(NewPersonne2.toString());
    }
}
