package aplicativos.multifuncional;

import aplicativos.navegador.NavegadorInternet;
import aplicativos.reprodutor.ReprodutoMusical;
import aplicativos.telefonico.AparelhoTelefonico;

public class AppMultifuncional implements NavegadorInternet, AparelhoTelefonico,ReprodutoMusical{
	public void exibirPagina() {
		System.out.println("Exibindo pagina por APP Multifuncional");
		
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova ABA por APP Multifuncional");
		
	}
	public void atualizarPagina() {
		System.out.println("Atualizando pagina por APP Multifuncional");
		
	}
	public void ligar() {
		System.out.println("Lingando pelo  APP Multifuncional");
		
	}
	public void atender() {
		System.out.println("Atendendo pelo APP Multifuncional");
		
	}
	public void iniciarChamadaVoz() {
		System.out.println("Iniciando Chamada de voz pelo APP Multifuncional");
		
	}
	public void tocar() {
		System.out.println("Tocando pelo APP Multifuncional");
		
	}
	public void pausar() {
		System.out.println("Paudando pelo APP Multifuncional");
		
	}
	public void selecionarMusica() {
		System.out.println("Selecionado nova music pelo APP Multifuncional");
		
	}	
}
