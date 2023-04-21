package entidades;

public class Funcionario implements Comparable<Funcionario> {
	String nome;
	Double salario;
	
	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	// ordenar por nome
	@Override
	public int compareTo(Funcionario outro) {
		return nome.compareTo(outro.getNome());
	}
	
/*	// ordenar por salario em ordem crescente
	@Override
	public int compareTo(Funcionario outro) {
		return salario.compareTo(outro.getSalario());
	}	
*/	
/*	// ordenar por salario em ordem decrescente
	@Override
	public int compareTo(Funcionario outro) {
		return -salario.compareTo(outro.getSalario());
	} 
*/	
}
