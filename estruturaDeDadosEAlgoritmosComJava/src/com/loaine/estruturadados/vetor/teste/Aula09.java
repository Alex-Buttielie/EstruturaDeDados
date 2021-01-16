package com.loaine.estruturadados.vetor.teste;

import com.loaine.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String [] args){
        Vetor vetor  = new Vetor(3);

        vetor.adicionar("B");
        vetor.adicionar("G");
        vetor.adicionar("D");
        vetor.adicionar("E");
        vetor.adicionar("F");

        System.out.println(vetor);
        vetor.remove(1);
        System.out.println(vetor);
        System.out.println("Remover elemento: E");
        int pos = vetor.busca("E");
        if(pos >-1 ){
            vetor.remove(pos);
        }else{
            System.out.println("Elemento E não foi encontrado");
        }
        System.out.println(vetor);
    }
}
