package model;

public class Palavra {
	private String palavra;
	private int tamanho;
	
	public Palavra(String palavra){
		this.palavra = palavra;
		tamanho = this.palavra.length();
		
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	

}
