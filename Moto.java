package Toy;

public class Moto extends Brinquedo {
	Moto(String nome, String cor, String tipo, int velocidade) {
		super(nome, cor, tipo, velocidade);
	}
	
	@Override
	public void Mover() {
		System.out.println("A Moto está acelerando");
	}
		
		
}

