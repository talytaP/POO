package banco;

import java.util.Objects;

public class Conta {
	String numeroConta;
	double saldo;
	Boolean status;
	
	public Conta(String numeroConta, double saldo, Boolean status) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.status = true;
	}
	
	public String toString() {
		return "conta [numero=" + numeroConta + ", saldo=" + saldo + ']';
				
	}
	
	public int hashCode() {
		return Objects.hash(numeroConta);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(getClass()!= obj.getClass())
			return false;
		Conta other = (Conta) obj;
		return Objects.equals(numeroConta,  other.numeroConta);
	}
	
	public void depositar(double quantia) {
		if (status)
			this.saldo += quantia;
		else
			System.out.println("Operação não pode ser realizada.");

	}
	
	public void saque(Double valor) {
	        if (valor <= saldo && status) {
	            saldo -= valor;
	        } else {
	            System.out.println("Saldo insuficiente para saque.");
	        }
	 } 	

	 public void transferir(Double valor, Conta destino) {
		 if(valor <= saldo && status && destino.status) {
			 saldo -= valor;
			 destino.depositar(valor);
		 }
	 }

	
		
	}




