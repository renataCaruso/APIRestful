package org.serratec.banco.projeto04.model;

import javax.persistence.Entity;

@Entity(name="conta")
public class Conta {
	
	private Integer numero;
	private String titular;
	private Double saldo;
	
//	public Conta(int numero, char titular) {}
	
	
	
	public Conta(Integer numero, String titular, Double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Conta() {
		super();
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
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
}
