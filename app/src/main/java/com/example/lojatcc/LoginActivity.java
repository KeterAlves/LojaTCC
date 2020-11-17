package com.example.lojatcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    EditText usuarioLogin, usuarioSenha;

    Button buttonLogar;

    TextView usuarioNovo, esqueceuSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        usuarioLogin = (EditText) findViewById(R.id.usuarioLogin);
        usuarioSenha = (EditText) findViewById(R.id.usuarioSenha);

        buttonLogar = (Button) findViewById(R.id.buttonLogar);

        esqueceuSenha = (TextView) findViewById(R.id.esqueceuSenha);
        usuarioNovo = (TextView) findViewById(R.id.usuarioNovo);

                //CONCLUSÃO DO LOGIN
        buttonLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaLoja = new Intent(LoginActivity.this,LojaActivity.class);
                startActivity(telaLoja);
            }
        });

             //CADASTRO DE USUARIO
        usuarioNovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaCadastro = new Intent(LoginActivity.this, CadastroActivity.class);
                startActivity(telaCadastro);
            }
        });
    }

}
