package com.io.fila;

import java.util.LinkedList;
import java.util.Queue;

public class FilaDoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Queue<String> fila = new LinkedList<>();
	   fila.add("paceinte 1");
	   fila.add("paciente 2");
	   fila.add("paciente 4");
	   fila.add("paceinte 2");
	   
	   System.out.println(fila);
	   fila.remove();
	   System.out.println(fila);

	}

}
