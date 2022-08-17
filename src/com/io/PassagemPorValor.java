package com.io;

public class PassagemPorValor {

	static void incrementa(int valor) {
		System.out.printf("valor apos incremento : %d\n", ++valor);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a = 10;
		incrementa(a);
		System.out.println(a);
	}

}
