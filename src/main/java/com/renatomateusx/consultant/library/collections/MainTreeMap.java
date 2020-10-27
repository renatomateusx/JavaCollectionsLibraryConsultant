package com.renatomateusx.consultant.library.collections;

import java.util.HashMap;
import java.util.Map;

public class MainTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> meses = new HashMap<>();
        meses.put(6, "Janeiro");
        meses.put(3, "Março");
        meses.put(8, "Abril");
        meses.put(2, "Fevereiro");

        meses.forEach((key, value) -> System.out.println("Chave: "+key+" - Value: " + value));
    }

    /*
    Nos Maps para adicionar é preciso informar a chave e o valor.
    O TreeMap tem ordenação pelas chaves.
    São ordenados pela chave e apenas os valores podem ser nulos. As chaves não.
    Saída:

    Chave: 2 - Value: Fevereiro
    Chave: 3 - Value: Março
    Chave: 6 - Value: Janeiro
    Chave: 8 - Value: Abril

    */
}
