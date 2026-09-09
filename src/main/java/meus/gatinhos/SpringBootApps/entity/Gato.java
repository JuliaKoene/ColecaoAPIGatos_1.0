package meus.gatinhos.SpringBootApps.entity;

import java.util.UUID;

public class Gato {
    private String nome;
    private String cor;
    private double peso;

    //getters

    public double getPeso() {
        return peso;
    }

    public String getCor() {
        return cor;
    }

    public String getNome() {
        return nome;
    }

    //setters

    public void setCor(String cor) {
        this.cor = cor;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
