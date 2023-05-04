package Programa;
import java.util.ArrayList;
import java.util.List;

public class Favoritos {
	private List<Video> listaVideos;
	
	
	public Favoritos() {
		this.listaVideos = new ArrayList<>();
	}
	
	public void adicionarVideo(Video video) {
		this.listaVideos.add(video);
	}
	

    public void removerVideo(Video video) {
        this.listaVideos.remove(video);
    }

    public List<Video> getListaVideos() {
        return listaVideos;
    }
	
}


