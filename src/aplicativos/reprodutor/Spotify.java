package aplicativos.reprodutor;

public class Spotify implements ReprodutoMusical {
	public void tocar() {
		System.out.println("Tocando uma musica no Spotify");
	}
	public void pausar() {
		System.out.println("Pausando uma musica no Spotify");
	}
	public void selecionarMusica() {
		System.out.println("Selecionando uma nova musica no Spotify ");
	}
}
