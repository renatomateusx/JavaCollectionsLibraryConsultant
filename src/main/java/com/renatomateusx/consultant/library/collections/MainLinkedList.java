package com.renatomateusx.consultant.library.collections;

import java.util.*;

public class MainLinkedList {
    public static void main(String[] args) {
        List<String> meses = new LinkedList<>();
        meses.add("Janeiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Fevereiro");

        meses.forEach((m) -> System.out.println(m));
        /*
            ARRAYLIST é mais rápido na recuperação de dados do que o Linkedlist.
            LinkedList tem melhor performance na exclusão e na adição dos dados.
            Os dados são alocados na ordem em que foram adicionados.

            Saída:
                Janeiro
                Março
                Abril
                Fevereiro
        */
        System.out.println("Saída na ordem crescente");
        Collections.sort(meses);
        meses.forEach((m) -> System.out.println(m));
        /*
            Abril
            Fevereiro
            Janeiro
            Março
        */

        System.out.println("Saída na ordem decrescente");
        Comparator<String> r = Collections.reverseOrder();
        Collections.sort(meses, r);
        meses.forEach((m) -> System.out.println(m));
        /*
            Março
            Janeiro
            Fevereiro
            Abril
        */

        System.out.println("O valor minimo é: " + Collections.min(meses));
        System.out.println("O valor maximo é: " + Collections.max(meses));

        System.out.println("Trocando de Posição");
        Collections.swap(meses, 0, 2);
        meses.forEach((m) -> System.out.println(m));
        /*
            Saída:

            Fevereiro
            Janeiro
            Março
            Abril
        * */

        System.out.println("Embaralhando");
        Collections.shuffle(meses);
        meses.forEach((m) -> System.out.println(m));

        /*
            Saída:

            Abril
            Fevereiro
            Janeiro
            Março
         */
    }


}
