package com.example.lojatcc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LojaActivity extends AppCompatActivity {
    List<Item> lstitem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loja);

        lstitem = new ArrayList<>();
        lstitem.add(new Item("nomeItem 1", "preco 1", "marca", "categoria", R.drawable.teste, 1));
        lstitem.add(new Item("nomeItem 2", "preco 2", "marca", "categoria", R.drawable.teste, 2));
        lstitem.add(new Item("nomeItem 3", "preco 3", "marca", "categoria", R.drawable.teste, 3));
        lstitem.add(new Item("nomeItem 4", "preco 4", "marca", "categoria", R.drawable.teste, 4));
        lstitem.add(new Item("nomeItem 5", "preco 5", "marca", "categoria", R.drawable.teste, 5));

        RecyclerView meurecycler = (RecyclerView) findViewById(R.id.recyclerItens);

         //JAVACLASS//                   //JAVACLASS//
        RecyclerAdapter myAdapter = new RecyclerAdapter(this, lstitem);
        meurecycler.setLayoutManager(new GridLayoutManager(this,2));
        meurecycler.setAdapter(myAdapter);

    }
}