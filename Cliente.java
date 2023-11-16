package banco;
import java.util.ArrayList;


public class Cliente {
	String nome;
	String cpf;
	ArrayList<Conta>contas = new ArrayList<>();
	
	public Cliente(String nome, String cpf) {
		this.nome = nome;
	    this.cpf = cpf;
	}
	public void adicionarConta(String nome, String cpf) {
		Cliente cliente = new Cliente(nome, cpf);
        clientes.add(cliente);
		
	}
	public void removerConta(String cpf) {
		 Cliente cliente = consultarClientePorCPF(cpf);
	        if (cliente != null) {
	            clientes.remove(cliente);
	            System.out.println("Cliente removido com sucesso.");
	        } else {
	            System.out.println("Cliente não encontrado.");
	        }
	    }
		
	 public static Cliente consultarClientePorCPF(String cpf) {
	        for (Cliente cliente : contas) {
	            if (cliente.cpf.equals(cpf)) {
	                return cliente;
	            }
	        }
	        return null;
	    }

	 
	 
	  
	        
	 
	 public static void criarConta(String numeroConta, Double saldo, Boolean status) {
	        Cliente cliente = new Cliente(null, null);
	        if (cliente != null) {
	            Conta c = new Conta("24003", 85, true);
	            cliente.contas.add(c);
	            Conta.put(numeroConta, c);
	            System.out.println("Conta criada com sucesso.");
	        } else {
	            System.out.println("Cliente não encontrado.");
	        }
	    }
}

 

	   
	

	 


