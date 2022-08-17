package com.io.lista;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	// construtor provisorio
	/*
	 * public Vetor(T[] elementos) { super(); this.elementos = elementos; }
	 */

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
	}

	/*
	 * public void adicionar(String elemento) { //verificar se as posições estão
	 * nulas for(int i = 0; i< this.elementos.length; i++) { if(this.elementos[i] ==
	 * null) { this.elementos[i] = elemento; break; } } }
	 */

	public void adicionar(String elemento) throws Exception {
		this.aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("impossivel adicionar mais elementos");
		}
	}

	public void adicionar(String elemento, int posicao) {
		this.aumentarCapacidade();
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("posicao inválida");
		}

		for (int i = this.tamanho; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
	}

	public void remove(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("posicao inválida");
		}
		for (int i = posicao; i < tamanho; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.elementos[this.tamanho] = null;
		this.tamanho--;
	}

	public String busca(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("posicao inválida");
		}
		return this.elementos[posicao];
	}

	public boolean busca(String elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (elemento.equals(this.elementos[i])) {
				return true;
			}
		}
		return false;
	}

	public int buscaIndice(String elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (elemento.equals(this.elementos[i])) {
				return i;
			}
		}
		return -1;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			sb.append(this.elementos[i]);
			sb.append(",");
		}

		if (this.tamanho > 0) {
			sb.append(this.elementos[this.tamanho - 1]);
		}

		sb.append("]");

		return sb.toString();
	}
	
	public void aumentarCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String [] novosElementos = new String[this.elementos.length * 2];
		    for(int i = 0; i < this.elementos.length; i++) {
		    	novosElementos[i] = this.elementos[i];
		    }
		    this.elementos = novosElementos;
		}
		
	}

}
