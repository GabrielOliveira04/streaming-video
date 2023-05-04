package Programa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ServicoStreaming servicoStreaming = new ServicoStreaming();

        // Adicionando alguns vídeos à lista de vídeos do serviço de streaming
        servicoStreaming.adicionarVideo(new Filme("Os Vingadores", "Joss Whedon", "Ação", "Os heróis mais poderosos da Terra se unem para salvar o planeta", 2012, 12));
        servicoStreaming.adicionarVideo(new Serie("Stranger Things", "The Duffer Brothers", "Suspense", "Uma cidade pequena é abalada pelo desaparecimento de um garoto", 2016, 14));

        // Cadastrando alguns usuários no serviço de streaming
        servicoStreaming.cadastrarUsuario(new Usuario("Maria", "maria@gmail.com", "123456"));
        servicoStreaming.cadastrarUsuario(new Usuario("João", "joao@gmail.com", "abc123"));

        // Exibindo a lista de vídeos do serviço de streaming
        System.out.println("Lista de vídeos:");
        for (Video video : servicoStreaming.getListaVideos()) {
            System.out.println(video);
        }

        // Exibindo a lista de usuários do serviço de streaming
        System.out.println("\nLista de usuários:");
        for (Usuario usuario : servicoStreaming.getListaUsuarios()) {
            System.out.println(usuario);
        }

        // Buscando um usuário pelo email
        System.out.print("\nDigite o email do usuário que deseja buscar: ");
        String email = scanner.nextLine();
        Usuario usuarioBuscado = servicoStreaming.buscarUsuarioPorEmail(email);
        if (usuarioBuscado != null) {
            System.out.println("\nUsuário encontrado:");
            System.out.println(usuarioBuscado);
        } else {
            System.out.println("\nUsuário não encontrado.");
        }

        // Realizando um acesso
        System.out.print("\nDigite o email do usuário que está acessando: ");
        String emailUsuario = scanner.nextLine();
        System.out.print("Digite o título do vídeo que está sendo acessado: ");
        String tituloVideo = scanner.nextLine();
        Usuario usuario = servicoStreaming.buscarUsuarioPorEmail(emailUsuario);
        Video video = servicoStreaming.buscarVideoPorTitulo(tituloVideo);
        if (usuario != null && video != null) {
            Acesso acesso = new Acesso(usuario, video);
            servicoStreaming.adicionarAcesso(acesso);
            System.out.println("\nAcesso registrado:");
            System.out.println(acesso);
        } else {
            System.out.println("\nUsuário ou vídeo não encontrado.");
        }

        scanner.close();
    }
}

