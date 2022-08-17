package com.io.fila;

public class TesteFila {

	public static void main(String[] args) {
		try {
			// TODO Auto-generated method stub
	        Fila<String> fila = new Fila<>();
	        fila.enfileirar("paciente 1");
	        fila.enfileirar("paciente 2");
	        fila.enfileirar("paciente 3");
	        fila.enfileirar("paciente 4");
	        fila.enfileirar("paciente 5");
	        	        
	        System.out.println(fila);
	        fila.desenfileirar();
	        System.out.println(fila);
	        fila.enfileirar("paciente 00");
	        System.out.println(fila);
	        fila.desenfileirar();
	        fila.desenfileirar();
	        fila.desenfileirar();
	        fila.desenfileirar();
	        fila.desenfileirar();
	        fila.enfileirar("paciente 10");
	        fila.enfileirar("paciente 11");
	        fila.enfileirar("paciente 12");
	        fila.enfileirar("paciente 13");
	        fila.enfileirar("paciente 14");
	        System.out.println(fila);
	        fila.esvaziar();
	        System.out.println(fila);
		} catch (Exception e) {
			// TODO: handle exception
		}
        
	}

}
