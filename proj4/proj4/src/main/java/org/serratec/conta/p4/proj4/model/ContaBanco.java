package org.serratec.conta.p4.proj4.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="conta")
public class ContaBanco {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer numero;
		private String titular;
		private Double saldo;
		
//		public Conta(int numero, char titular) {}
		
		
		
		public ContaBanco(Integer numero, String titular, Double saldo) {
			super();
			this.numero = numero;
			this.titular = titular;
			this.saldo = saldo;
		}

		public ContaBanco() {
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