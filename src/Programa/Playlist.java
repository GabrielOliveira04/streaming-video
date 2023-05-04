package Programa;
import java.util.ArrayList;
import java.util.List;


public class Playlist {
    private List<ItemPlaylist> listaItens;

    public Playlist() {
        this.listaItens = new ArrayList<>();
    }

    public void adicionarItem(ItemPlaylist item) {
        this.listaItens.add(item);
    }

    public void removerItem(ItemPlaylist item) {
        this.listaItens.remove(item);
    }

    public void reproduzir() {
        for (ItemPlaylist item : listaItens) {
            System.out.println("Reproduzindo: " + item.getTitulo());
        }
    }

    public List<ItemPlaylist> getListaItens() {
        return listaItens;
    }
}
