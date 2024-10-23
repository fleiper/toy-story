package Toy;

public class Brinquedo {

	private String nome;
	private String cor;
	private String tipo;
	private int velocidade;

	Brinquedo (String nome, String cor,String tipo,int velocidade){
		this.nome = nome;
		this.cor = cor;
		this.tipo = tipo;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getcor() {
		return cor;
	}
	public void setcor(String cor) {
		this.cor = cor;
	}
	public String settipo () {
		return tipo;
	}
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	public int getvelocidade() {
		return velocidade;
	}
	public void setvelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public void Mover() {

		
	}
}


