package com.io.fila;

import com.io.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {
 
	public void enfileirar(T element) throws Exception {
		super.adicionar(element);
	}
	
	public T desenfileirar() throws Exception{
		if(super.tamanho() == 0) {
			return null;
		}
		T t = (T) super.busca(0);
		super.remove(0);
		return t;
	}
	
	public boolean isVazia() {
		return super.tamanho() == 0;
	}
	
	public T espiar() {
		if(super.tamanho() == 0) {
			return null;
		}
		return (T) super.busca(0);
	}
	
	public int tamanho() {
		return super.tamanho();
	}
	
	public T obterInicioDaFila() throws Exception {
		return (T) super.busca(0);
	}
	
	public T obterFinalDaFila() {
		return (T) super.busca(super.tamanho() - 1);
	}
	
	public void esvaziar() {
		super.esvaziar();
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	
}
