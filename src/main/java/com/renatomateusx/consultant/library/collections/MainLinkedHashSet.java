package com.renatomateusx.consultant.library.collections;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MainLinkedHashSet {
    public static void main(String[] args) {
        Set<String> meses = new LinkedHashSet<>();
        meses.add("Janeiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Fevereiro");

        meses.forEach((m) -> System.out.println(m));
    }
 /*
    Nos conjuntosn não existem dados repetidos.
    A ordem não É GARANTIDA no LinkedHashSet

    Saída:
        Janeiro
        Março
        Abril
        Fevereiro

    */
}
