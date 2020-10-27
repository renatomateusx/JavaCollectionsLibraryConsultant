package com.renatomateusx.consultant.library.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<String> meses = new TreeSet<>();
        meses.add("Janeiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Fevereiro");

        meses.forEach((m) -> System.out.println(m));
    }

    /*
    Nos conjuntosn não existem dados repetidos.
    A ordem é garantida no sentido de dados. Veja:

    Saída:
        Abril
        Fevereiro
        Janeiro
        Março

    */
}
