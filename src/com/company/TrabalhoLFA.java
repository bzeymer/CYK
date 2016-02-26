package com.company;

import java.util.ArrayList;

public class TrabalhoLFA {

    public static ArrayList<Regra> regras = new ArrayList<>();
    public static ArrayList<StringBuilder> matriz = new ArrayList<>();

    public static void main(String[] args) {

	// write your code here
        regras = Arquivo.lerArquivo(args[0]);

        /*regras[1] = new Regra('S', "AT");
        regras[2] = new Regra('S', "AB");
        regras[3] = new Regra('T', "XB");
        regras[4] = new Regra('X', "AT");
        regras[5] = new Regra('X', "AB");
        regras[6] = new Regra('A', "a");
        regras[7] = new Regra('B', "b");*/

        for (Regra regra:regras) {
            System.out.println(regra.variavel + " =>> " + regra.producao);
        }

        String palavra = args[1];
        System.out.println(palavra);

        Arquivo.escreveArquivo(args[2], matriz);
        System.out.println(args[2]);

    }
}
