
public class Engenheiro extends Funcionario{
	int crea;
	public void setSalario(int salario) {
		super.setSalario(salario);
	}
	public double boni () {
		return super.getSalario() * 1.5 ;
	}
}
