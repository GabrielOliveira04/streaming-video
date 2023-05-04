package Programa;

public class Video {
	
	private String titulo;
	private String diretor;
	private String genero;
	private String sinopse;
	private int anoLancamento;
	private int classificacao;
	
	
	public Video(String titulo,String diretor, String genero, String sinopse, int anoLancamento, int classificacao) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.genero = genero;
		this.sinopse = sinopse;
		this.anoLancamento = anoLancamento;
		this.classificacao = classificacao;
	}




	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDiretor() {
		return diretor;
	}



	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public String getSinopse() {
		return sinopse;
	}



	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}



	public int getAnoLancamento() {
		return anoLancamento;
	}



	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	


	public int getClassificacao() {
		return classificacao;
	}



	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public String toString() {
		return "\nTitulo " + this.getTitulo() + "\nDiretor: " + this.getDiretor() + "\nGenero: " + this.getGenero() + "\nSinopse: " + this.getSinopse() + 
				"\nAno de Lançamento: " + this.getAnoLancamento() +  "\nClassificação: " + this.getClassificacao();
	}
	

	
}

	
	
	
	
	

