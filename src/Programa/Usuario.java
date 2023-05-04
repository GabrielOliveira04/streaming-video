package Programa;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
	
	private String nome;
	private String email;
	private String senha;
	private List<String> favoritos;
	private int idade;
	
	public Usuario(String nome, String email, String senha) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.favoritos = new ArrayList <>();
		
	}


    public void adicionarFavorito(String titulo) {
        favoritos.add(titulo);
    }

    public void removerFavorito(String titulo) {
        favoritos.remove(titulo);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean verificarLogin(String email, String senha) {
        return this.email.equals(email) && this.senha.equals(senha);
    }

    public static Usuario cadastrar(String nome, String email, String senha) {
        
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getEmail().equals(email)) {
                throw new IllegalArgumentException("Email já cadastrado");
            }
        }
        
       
        Usuario novoUsuario = new Usuario(nome, email, senha);
        listaUsuarios.add(novoUsuario);
        
        
        return novoUsuario;
    }
	
    public int getIdade() { 
        return idade;
    }
    
    public void setIdade(int idade) { 
        this.idade = idade;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
