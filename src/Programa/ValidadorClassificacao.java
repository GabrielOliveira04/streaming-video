package Programa;

public class ValidadorClassificacao {
	public boolean validar( int classificacaoVideo, int idadeUsuario) {
		if(classificacaoVideo == 0) {
			return true;
		}else if (idadeUsuario >= classificacaoVideo) {
			return true;
		}else {
			return false;
		}
	}

}
