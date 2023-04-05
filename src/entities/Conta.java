package entities;

import model.excetions.Ecessoes;

public class Conta {

	Integer numero ;
	String titular;
	Double balanco;
	Double limiteRetirada;
	
	public  Conta() {
		
	}
public Conta(Integer numero, String titular, Double balanco, Double limiteRetirada) {
		
		
		this.numero = numero;
		this.titular = titular;
		this.balanco = balanco;
		this.limiteRetirada = limiteRetirada;
	}
	
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getBalanco() {
		return balanco;
	}

	public void setBalanco(Double balanco) {
		this.balanco = balanco;
	}

	public Double getLimiteRetirada() {
		return limiteRetirada;
	}

	public void setLimiteRetirada(Double limiteRetirada) {
		this.limiteRetirada = limiteRetirada;
	}

	
	
	public void deposito(double quantia) {
		balanco += quantia; 
	}
	
public void retirada(double quantia) {
	if(quantia > limiteRetirada || quantia > balanco) {
		throw new Ecessoes ("A quantia que deseja sacar é maior que o limite de retirada ");
	
		
	}
	else{
	
		balanco -= quantia;
	}
}
	
	
}
