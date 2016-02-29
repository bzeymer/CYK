package com.company;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by breno on 24/02/16.
 */
class Arquivo{

    static ArrayList lerArquivo (String nomeArquivo){
        ArrayList<Regra> regras = new ArrayList<>();
        try {
            File arquivo = new File(nomeArquivo);
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            String entrada;
            int i=0;
            while ((entrada = br.readLine())!= null){
                Regra regra = new Regra();
                regra.variavel += entrada.charAt(0);
                entrada = entrada.substring(5);
                for (int j=0;j<entrada.length();++j) {
                    if (entrada.charAt(j) == ' ') {

                    } else if (entrada.charAt(j) == '|'){
                        regras.add(regra);
                        String aux = regra.variavel;
                        regra = new Regra();
                        regra.variavel = aux;
                    } else {
                        regra.producao += entrada.charAt(j);
                    }
                }
                regras.add(regra);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

        // file utils!!
        return regras;
    }

    static void escreveArquivo (String nomeArquivo, String[][] matriz){

    }

}
