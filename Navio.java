package Toy;

public class Navio extends Brinquedo {
	
	Navio(String nome, String cor, String tipo, int velocidade) {
		super(nome, cor, tipo, velocidade);
	}
	
	@Override
	public void Mover() {
		System.out.println("O Navio veleja aos quatro ventos");
	}
		
		
}
