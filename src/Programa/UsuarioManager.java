package Programa;
import java.util.ArrayList;
import java.util.List;

public class UsuarioManager {
	
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	
	
	public static Usuario Cadastrar(String nome, String email, String senha) {
		for(Usuario usuario: listaUsuarios) {
			if(usuario.getEmail().equals(email)) {
				throw new IllegalArgumentException("Email já cadastrado");
			}
		}

		Usuario novoUsuario = new Usuario(nome,email,senha);
		listaUsuarios.add(novoUsuario);
		return novoUsuario;
	}

	public static List<Usuario> getListaUsuarios(){
		return listaUsuarios;







}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
