package com.example.lojatcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CadastroActivity extends AppCompatActivity {
    EditText cadastroLogin, cadastroSenha, cadastroconfSenha;

    Button buttonRegistrar;

    TextView jaCadastrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        cadastroLogin = (EditText)findViewById(R.id.cadastroLogin);
        cadastroSenha = (EditText)findViewById(R.id.cadastroSenha);
        cadastroconfSenha = (EditText)findViewById(R.id.cadastroconfSenha);

        buttonRegistrar = (Button)findViewById(R.id.buttonRegistrar);

        jaCadastrado = (TextView)findViewById(R.id.jaCadastrado);

        jaCadastrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLogin = new Intent(CadastroActivity.this,LoginActivity.class);
                startActivity(telaLogin);
            }
        });
    }
}