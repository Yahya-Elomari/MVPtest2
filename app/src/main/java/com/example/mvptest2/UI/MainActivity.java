package com.example.mvptest2.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvptest2.R;

public class MainActivity extends AppCompatActivity implements EtudiantView {
    TextView tv;
    Button btn;
    EtudiantPresenter presenter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv1);
        btn = findViewById(R.id.btn_valid);
        presenter = new EtudiantPresenter(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.getEtudiant();
            }
        });
    }

    @Override
    public void onGetEtudiant(String etudiant) {
        tv.setText(etudiant);
    }
}