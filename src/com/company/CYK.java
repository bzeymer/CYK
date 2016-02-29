package com.company;

import java.util.ArrayList;

/**
 * Created by breno on 26/02/16.
 */
 public class CYK {
    public static void rodarCYK (String[][] matriz, int tamEntrada, ArrayList<Regra> regras){
        for (int i=tamEntrada-2;i>=0;--i){
            int linha = tamEntrada-i;
            for (int j=0; j<=i;++j){
                int soma = i+j;
                matriz[i][j] += (char)('0'+i)+" "+(char)('0'+j);

            }
        }
    }

    private static void comparar(String[][] matriz, int i, int j,ArrayList<Regra> regras){
        for (:
             ) {

        }if (matriz[i][j]==){

        }
    }
}
