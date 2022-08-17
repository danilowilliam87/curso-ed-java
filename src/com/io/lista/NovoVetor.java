package com.io.lista;

import java.lang.reflect.Array;

public class NovoVetor<T> {

	private T[] elementos;
	private int tamanho;
	
	public NovoVetor(int capacidade, Class<T> tipoDaClasse) {
		this.elementos = (T[]) Array.newInstance(tipoDaClasse, capacidade);
	}
	
	public NovoVetor(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
	}
	
	public void adicionar(T elemento) throws Exception {
		this.aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			throw new Exception("impossivel adicionar mais elementos");
		}
	}

	public void adicionar(T elemento, int posicao) {
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

	public T busca(int posicao) {
		if (!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("posicao inválida");
		}
		return this.elementos[posicao];
	}

	public boolean busca(Object elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (elemento.equals(this.elementos[i])) {
				return true;
			}
		}
		return false;
	}

	public int buscaIndice(T elemento) {
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
			T [] novosElementos =(T[]) new Object[this.elementos.length * 2];
		    for(int i = 0; i < this.elementos.length; i++) {
		    	novosElementos[i] = this.elementos[i];
		    }
		    this.elementos = novosElementos;
		}
		
	}

	
}
