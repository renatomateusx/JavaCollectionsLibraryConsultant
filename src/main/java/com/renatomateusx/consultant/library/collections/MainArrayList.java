package com.renatomateusx.consultant.library.collections;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args) {
        List<String> meses = new ArrayList<String>();
        meses.add("Janeiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Fevereiro");

        meses.forEach((m) -> System.out.println(m));
    }

    /*
    ARRAYLIST é mais rápido na recuperação de dados do que o Linkedlist.
    LinkedList tem melhor performance na exclusão e na adição dos dados.
    Os dados são alocados na ordem em que foram adicionados.
    */
}
