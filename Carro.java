package Toy;

public class Carro extends Brinquedo {
	
	Carro(String nome, String cor, String tipo, int velocidade) {
		super(nome, cor, tipo, velocidade);
	}
	
	@Override
	public void Mover() {
		System.out.println("O carro está estacionado");
	}

		
	}

