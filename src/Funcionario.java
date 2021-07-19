
public  class Funcionario {
	protected String nome;
	private int salario;
	
	public  double boni () {
		return (this.salario * 1.3);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		if (salario > 0)
			this.salario = salario;
		else this.salario = 0;
	}

	
	
	public  double desconto() {
		return this.salario - 0.1;
	}

}
