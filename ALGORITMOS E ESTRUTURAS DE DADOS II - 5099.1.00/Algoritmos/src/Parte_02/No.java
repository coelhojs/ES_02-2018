package Parte_02;

public class No {
	public int elemento;
	public No esq;
	public No dir;

	public No(int elemento) {
		this(elemento, null, null);
	}

	public No(int elemento, No esq, No dir) {
		this.elemento = elemento;
		this.esq = esq;
		this.dir = dir;
	}
}
