package com.io.lista;

import java.util.ArrayList;

public class TesteNovoVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  NovoVetor<String> vetor1 = new NovoVetor<>(2);
          NovoVetor<Integer>vetor2 = new NovoVetor<>(1);
          
          vetor1.adicionar("Bahia");
          vetor1.adicionar("Cruzeiro");
          vetor1.adicionar("Vasco");
          vetor1.adicionar("Gremio");
          
          vetor2.adicionar(1);
          vetor2.adicionar(3);
          vetor2.adicionar(5);
          vetor2.adicionar(7);
          
          System.out.println(vetor1);
          System.out.println(vetor2);
	} catch (Exception e) {
		// TODO: handle exception
	}
	}

}
