package com.example.mvptest2.Model;

public class EtudiantModel {
    String nom,prenom;
    int age;
    public EtudiantModel(String nom,String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
