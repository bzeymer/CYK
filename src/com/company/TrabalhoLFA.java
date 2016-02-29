package com.company;

import java.util.ArrayList;

public class TrabalhoLFA {

    public static void main(String[] args) {

        // write your code here

        ArrayList<Regra> regras = new ArrayList();
        regras = Arquivo.lerArquivo(args[0]);
        int tamEntrada = args[1].length();
        String[][] matriz = new String[tamEntrada+1][tamEntrada];

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

        for (int i = 0;i<tamEntrada+1;++i){
            for (int j = 0;j<tamEntrada;++j){
                matriz[i][j]="";
            }
        }

        for (int i=0; i<tamEntrada; ++i) {
            matriz[tamEntrada][i]+=args[1].charAt(i);
        }
        for (int i=0; i<tamEntrada; ++i) {
            for (Regra regra: regras) {
                if (regra.producao.equals(matriz[tamEntrada][i])){
                    matriz[tamEntrada-1][i]+=regra.variavel;
                }
            }
        }

        CYK.rodarCYK(matriz, tamEntrada, regras);

        for (int i = 0; i < tamEntrada+1; i++) {
            if ((tamEntrada-i)!=0) {
                System.out.print(tamEntrada-i);
                for (int j = 0; j < tamEntrada; j++) {
                    if (j <= i) {
                        System.out.print(" {" + matriz[i][j] + "}");
                    }
                }
            }
            else {
                System.out.print("p");
                for (int j = 0; j < tamEntrada; j++) {
                    System.out.print("  "+matriz[i][j]+" ");
                }
            }
            System.out.println();
        }

        String palavra = args[1];
        System.out.println(palavra);

        Arquivo.escreveArquivo(args[2], matriz);
        System.out.println(args[2]);

    }
}
