package com.renatomateusx.consultant.library.collections;

import java.util.*;

public class MainHashSet {
    public static void main(String[] args) {
        Set<String> meses = new HashSet<>();
        meses.add("Janeiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Fevereiro");

        meses.forEach((m) -> System.out.println(m));
    }

    /*
    Nos conjuntosn não existem dados repetidos.
    A ordem não é garantida no HashSet

    Saída:
    Abril
    Janeiro
    Março
    Fevereiro

    */
}
