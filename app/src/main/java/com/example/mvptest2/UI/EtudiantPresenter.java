package com.example.mvptest2.UI;

import com.example.mvptest2.Model.EtudiantModel;

public class EtudiantPresenter{
    EtudiantView view;
    public EtudiantPresenter(EtudiantView view){
        this.view=view;
    }
    public EtudiantModel getEtudiant(){
        return new EtudiantModel("Elomari","Yahya",20);
    }

    public void getEtudiantNom(String etudiant) {
        view.onGetEtudiant(getEtudiant().getNom());
    }
}
