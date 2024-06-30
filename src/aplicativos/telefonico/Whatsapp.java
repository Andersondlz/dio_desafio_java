package aplicativos.telefonico;

public class Whatsapp implements AparelhoTelefonico{
	public void ligar() {
		System.out.println("Ligando para um numero");
	}
	public void atender() {
		System.out.println("Atendendo um numero");
	}
	public void iniciarChamadaVoz() {
		System.out.println("Fazendo uma chamada de VOZ");
	}
}
