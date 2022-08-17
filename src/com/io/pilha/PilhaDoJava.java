package com.io.pilha;

import java.util.Stack;

public class PilhaDoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<>();
		
		pilha.push("primeiro");
		pilha.push("segundo");
		pilha.push("terceiro");
		pilha.push("quarto");
		pilha.push("quinta");
		pilha.push("sexto");
		pilha.push("setimo");
		pilha.push("oitavo");
		pilha.push("nono");
		
		System.out.println(pilha);
		System.out.println(pilha.peek());
		System.out.println(pilha.empty());
		System.out.println(pilha.pop());
		
		System.out.println(pilha);
		System.out.println(pilha.size());

	}

}
