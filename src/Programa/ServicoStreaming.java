package Programa;

import java.util.ArrayList;
import java.util.List;



public class ServicoStreaming {
	
	private List<Video> listaVideos;
	private List<Usuario> listaUsuarios;
	private List<Acesso> listaAcessos;
	
	
	public ServicoStreaming() {
		listaVideos = new ArrayList<>();
		listaUsuarios = new ArrayList<>();
		listaAcessos = new ArrayList<>();
		
	}
	
	
	  public void adicionarVideo(Video video) {
	        listaVideos.add(video);
	    }

	    public void cadastrarUsuario(Usuario usuario) {
	        listaUsuarios.add(usuario);
	    }

	    public Usuario buscarUsuarioPorEmail(String email) {
	        for (Usuario usuario : listaUsuarios) {
	            if (usuario.getEmail().equals(email)) {
	                return usuario;
	            }
	        }
	        return null;
	    }

	    public boolean verificarPermissaoAcesso(Usuario usuario, Video video) {
	    	ValidadorClassificacao validador = new ValidadorClassificacao();
	    	
	    	int classificacaoVideo = video.getClassificacao();
	    	return validador.validar(classificacaoVideo, usuario.getIdade());
	    	
	    }
	
	    public void registrarAcesso(Usuario usuario, Video video) {
	        Acesso acesso = new Acesso(usuario, video);
	        listaAcessos.add(acesso);
	    }

	    public List<Video> getListaVideos() {
	        return listaVideos;
	    }

	    public List<Usuario> getListaUsuarios() {
	        return listaUsuarios;
	    }

	    public List<Acesso> getListaAcessos() {
	        return listaAcessos;
	    }


		public Video buscarVideoPorTitulo(String tituloVideo) {
			for (Video video : listaVideos) {
	            if (video.getTitulo().equals(tituloVideo)) {
	                return video;
	            }
	        }
	       
			return null;
		}


		public void adicionarAcesso(Acesso acesso) {
			listaAcessos.add(acesso);
			
		}
	    
	    

}
