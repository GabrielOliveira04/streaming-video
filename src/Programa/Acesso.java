package Programa;
import java.time.LocalDateTime;



public class Acesso {
	
	    private Usuario usuario;
	    private Video video;
	    private LocalDateTime data;

	    public Acesso(Usuario usuario, Video video) {
	        this.usuario = usuario;
	        this.video = video;
	        this.data = LocalDateTime.now();
	    }

	    public Usuario getUsuario() {
	        return usuario;
	    }

	    public Video getVideo() {
	        return video;
	    }

	    public LocalDateTime getData() {
	        return data;
	    }
	}

