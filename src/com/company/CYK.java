package com.company;

import java.util.ArrayList;

/**
 * Created by breno on 26/02/16.
 */
public class CYK {
    public static void rodarCYK (String[][] matriz, int tamEntrada, ArrayList<Regra> regras){
        for (int i=tamEntrada-2;i>=0;--i){
            //int linha = tamEntrada-i;
            int k = 4;
            for (int j=0; j<=i;++j){
                //iteraProducoes(matriz, i, j, tamEntrada, k, regras);

            }
            ++k;
        }
    }

    private static void iteraProducoes (String[][] matriz, int linha, int coluna, int tamEntrada,int k, ArrayList<Regra> regras){
        int i,j;
        if ((tamEntrada-2)!=linha){
            for (i = linha + 1; i < tamEntrada; i++) {
                for (j = 0; j < linha - 1; j++) {
                    if ((i-j)==linha) {
                        comparar(matriz[linha][coluna], matriz[i][coluna], matriz[j][tamEntrada - i], regras);
                    //}
                }
            }
        } else {
            comparar(matriz[linha][coluna], matriz[linha+1][coluna], matriz[linha+1][coluna+1], regras);
        }
    }

    private static void comparar(String s1, String s2, String s3, ArrayList<Regra> regras){
        String aux = "";
        for (int i = 0; i < regras.size(); i++) {
            Regra regra = regras.get(i);
            for (char c2:s2.toCharArray()) {
                for (char c3:s3.toCharArray()) {
                    aux = ""+c2+c3;
                    if (regra.producao.contentEquals(aux)){
                        s1 += regra.variavel;
                    }
                }
            }
        }

    }
}
