package com.io.pilha;

public class TestePilha1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pilha1<String> pilha1 = new Pilha1<>();
        Pilha1<String> pilha2 = new Pilha1<>();
        System.out.println(pilha1);
        
        for(int i = 0; i <= 100; i++) {
        	try {
        		pilha1.adicionar("item : " + i);
			} catch (Exception e) {
				// TODO: handle exception
			}
        }
        
        System.out.println(pilha1.tamanho());
        System.out.println(pilha1);
        System.out.println(pilha1.isVazia());
        System.out.println(pilha2.isVazia());
        System.out.println(pilha1.peek());
        System.out.println("item removido da pilha : "+pilha1.unPeek());
        System.out.println("topo : "+pilha1.peek());
        System.out.println("tamanho : " + pilha1.tamanho());
        
        for(int y = 0; y < 90; y++) {
        	pilha1.unPeek();
        }
        
        System.out.println(pilha1.tamanho());
        System.out.println(pilha1);
	}

}
