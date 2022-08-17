package com.io.lista;

import java.util.ArrayList;
import java.util.List;

public class ListaDoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> lista = new ArrayList<>();
        lista.add("Bahia");
        lista.add("Cruzeiro");
        lista.add("Grêmio");
        lista.add("Vasco");
        
        System.out.println(lista);
        lista.add(3, "londrina");
        System.out.println(lista);
        
        System.out.println(lista.contains("Internacional"));
        System.out.println();
	}

}
