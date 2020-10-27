package com.renatomateusx.consultant.library.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainHashMap {
    public static void main(String[] args) {
        Map<Integer, String> meses = new HashMap<>();
        meses.put(5, "Janeiro");
        meses.put(3, "Março");
        meses.put(1, "Abril");
        meses.put(2, "Fevereiro");

        meses.forEach((key, value) -> System.out.println("Chave: "+key+" - Value: " + value));
    }

    /*
    Nos Maps para adicionar é preciso informar a chave e o valor.
    O HashMap permite valores nulos tanto para chave quanto para os values.
    O HashMap não tem ordenação específica.

    Saída:

    Chave: 1 - Value: Abril
    Chave: 2 - Value: Fevereiro
    Chave: 3 - Value: Março
    Chave: 5 - Value: Janeiro

    */
}
