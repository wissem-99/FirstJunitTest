package com.company;

public class personne {
    public int Cin;
    public String Nom;
    public int age;

    public personne() {
    }

    public personne(int cin, String nom, int age) {
        Cin = cin;
        Nom = nom;
        this.age = age;
    }

    public int getCin() {
        return Cin;
    }

    public void setCin(int cin) {
        Cin = cin;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "personne{" +
                "Cin=" + Cin +
                ", Nom Personne='" + Nom  + '\'' +
                ", age=" + age +
                '}';
    }
}
