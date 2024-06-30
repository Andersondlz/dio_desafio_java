package aplicativos.reprodutor;

public class AmazonMusic implements ReprodutoMusical{
	public void tocar() {
		System.out.println("Tocando uma musica na AmazonMusic");
	}
	public void pausar() {
		System.out.println("Pausando uma musica na AmazonMusic");
	}
	public void selecionarMusica() {
		System.out.println("Selecionando uma nova musica no AmazonMusic");
	}

}
