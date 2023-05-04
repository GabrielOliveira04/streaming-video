package Programa;
import java.util.ArrayList;
import java.util.List;

public class ItemPlaylist {
	private String titulo;
	private String diretor;
	private List<String> elenco;
	private String genero;
	private String sinopse;
	
	public ItemPlaylist(String titulo, String diretor, List<String>elenco, String genero, String sinopse)  {
		this.titulo = titulo;
        this.diretor = diretor;
        this.elenco = elenco;
        this.genero = genero;
        this.sinopse = sinopse;
	
	
	}

	 public String getTitulo() {
	        return titulo;
	    }

	    public String getDiretor() {
	        return diretor;
	    }

	    public List<String> getElenco() {
	        return elenco;
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public String getSinopse() {
	        return sinopse;
	    }
	
	
	
}
