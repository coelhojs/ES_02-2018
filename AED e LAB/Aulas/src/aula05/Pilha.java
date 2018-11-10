package aula05;


public class Pilha {
	Fila f1, f2;

	Pilha() {
		f1 = new Fila();
		f2 = new Fila();
	}

	void empilhar(int x) throws Exception {
		while (!f1.isVazia())
			f2.enfileirar(f1.desenfileirar());

		f1.enfileirar(x);

		while (!f2.isVazia())
			f1.enfileirar(f2.desenfileirar());
	}

	int desempilhar() throws Exception {
		return f1.desenfileirar();
	}
	
	boolean isVazia(){
		return f1.isVazia();
	}

}
