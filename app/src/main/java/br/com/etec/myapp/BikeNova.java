package br.com.etec.myapp;

public class BikeNova {
    private String titulo;
    private int imagem;

    //construtor da classe
    //alt+insert
    public BikeNova(String titulo, int imagem) {
        this.titulo = titulo;
        this.imagem = imagem;
    }

    //métodos de acesso get e set

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

}