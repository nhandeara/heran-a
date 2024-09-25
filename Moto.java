package Heranca;

public class Moto extends Veiculo{

 private int cilindrada;
	
	public Moto(int cilindrada, String marca, String modelo, String cor, int ano) {
		super(marca,modelo,cor, ano); //herdando atributos de superclasse
	
		this.cilindrada=cilindrada;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada= cilindrada;

}
}
