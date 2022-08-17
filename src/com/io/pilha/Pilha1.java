package com.io.pilha;

import com.io.base.EstruturaEstatica;

public class Pilha1<T> extends EstruturaEstatica<T> {
	
	
	public Pilha1() {
		super();
	}
	
	public Pilha1(int capacidade) {
		super(capacidade);
	}

	
	public void push(T element) throws Exception{
        super.adicionar(element);		
 	}
	
	public int tamanho() {
		return super.tamanho();
	}
	
	public boolean isVazia() {
		return super.tamanho() == 0;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	public T peek() {
		if(this.isVazia()) {
			return null;
		}
		return (T) super.busca(super.tamanho() - 1);
	}
	
	public T unPeek() {
		if(this.isVazia()) {
			return null;
		}
		T t = (T) super.busca(super.tamanho() - 1);
		 super.remove(super.tamanho() - 1);
		 return t;
	}
	
	
	
	
	
}
