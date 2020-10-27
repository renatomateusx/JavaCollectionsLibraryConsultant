package com.renatomateusx.consultant.library.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainLinkedHashMap {
    public static void main(String[] args) {
        Map<Integer, String> meses = new LinkedHashMap<>();
        meses.put(6, "Janeiro");
        meses.put(3, "Março");
        meses.put(8, "Abril");
        meses.put(2, "Fevereiro");

        meses.forEach((key, value) -> System.out.println("Chave: "+key+" - Value: " + value));
    }

    /*
    Nos Maps para adicionar é preciso informar a chave e o valor.
    O LinkedHashMap tem ordenação pela ordem de inserção.
    São ordenados pela chave e apenas os valores podem ser nulos. As chaves não.
    Saída:

    Chave: 6 - Value: Janeiro
    Chave: 3 - Value: Março
    Chave: 8 - Value: Abril
    Chave: 2 - Value: Fevereiro

    */
}
