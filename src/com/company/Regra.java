package com.company;

/**
 * Created by breno on 25/02/16.
 */
public class Regra {

    public String variavel;
    public String producao;

    public Regra(){
        this.variavel = "";
        this.producao = "";
    }

    public Regra(String variavel, String producao) {
        this.variavel = variavel;
        this.producao = producao;
    }
}
