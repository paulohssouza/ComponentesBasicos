package com.cursoandroid.ph.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inputName;
    private EditText inputEmail;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputName = findViewById(R.id.inputName);
        inputEmail = findViewById(R.id.inputEmail);
        result = findViewById(R.id.result);
    }

    public void send (View view) {
        String nome = inputName.getText().toString();
        String email = inputEmail.getText().toString();
        result.setText("Nome: " + nome + "\nEmail: " + email);
    }

    public void limpar (View view) {
        inputName.setText("");
        inputEmail.setText("");
        result.setText("Resultado");
    }
}