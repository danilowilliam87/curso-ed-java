package com.io.lista;

public class TesteVetorGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	VetorGenerico generico = new VetorGenerico(5);
            generico.adicionar(10);
            generico.adicionar(100);
            generico.adicionar(105);
            generico.adicionar(4);
            generico.adicionar(136);
            generico.adicionar(95);
            generico.adicionar(70);
            generico.adicionar(85);
            generico.adicionar(64);
            
            System.out.println(generico);
            System.out.println(generico.tamanho());
		} catch (Exception e) {
			// TODO: handle exception
		}
        
	}

}
