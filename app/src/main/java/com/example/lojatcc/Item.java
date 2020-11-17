package com.example.lojatcc;

public class Item {

    private int foto;
    private int id_Produto;
    private String Nome;
    private String preco_Unitario;
    private String marca;
    private String categoria;

    public Item() {
    }

    public Item( String nome, String preco_Unitario, String marca, String categoria, int foto, int id_Produto) {
        Nome = nome;
        this.preco_Unitario = preco_Unitario;
        this.marca = marca;
        this.categoria = categoria;
        this.foto = foto;
        this.id_Produto = id_Produto;
    }

                ////////////////-------GETTER------////////////////////

    public int getFoto() {
        return foto;
    }

    public int getId_Produto() {
        return id_Produto;
    }

    public String getNome() {
        return Nome;
    }

    public String getPreco_Unitario() {
        return preco_Unitario;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

            //////////////////---------SETTER--------/////////////////////

    public void setId_Produto(int id_Produto) {
        this.id_Produto = id_Produto;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setPreco_Unitario(String preco_Unitario) {
        this.preco_Unitario = preco_Unitario;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
