package com.io.lista;

public class TesteAumentaCapacidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  Vetor vetor = new Vetor(2);
          vetor.adicionar("A");
          vetor.adicionar("E");
          vetor.adicionar("I");
          vetor.adicionar("O");
          vetor.adicionar("U");
          
          System.out.println(vetor);
	} catch (Exception e) {
		// TODO: handle exception
		System.err.print(e.getMessage());
	}
        
	}

}
