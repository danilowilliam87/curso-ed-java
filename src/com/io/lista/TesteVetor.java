package com.io.lista;

public class TesteVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	 Vetor vetor = new Vetor(20);
             vetor.adicionar("danilo");
             vetor.adicionar("daniele");
             vetor.adicionar("damiana");
             vetor.adicionar("dalva");
             vetor.adicionar("domingos");
             vetor.adicionar("cizinio");
             System.out.println(vetor);
             System.out.println(vetor.tamanho());
             System.out.println(vetor.busca("danilo"));
             System.out.println(vetor.buscaIndice("danilo"));
             vetor.adicionar("teste", 0);
             System.out.println(vetor);
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e.getMessage());
		}
         
         
	}

}
