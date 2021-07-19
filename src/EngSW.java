
public class EngSW extends Funcionario{
	String linguagem; 
	int tempoFerias;
	String localferias;
	
	@Override
	public double boni () {
		this.localferias = "Bahamas";
		this.tempoFerias = 60;
		System.out.println("Local Ferias " + this.localferias + " tempo Ferias " + this.tempoFerias);
		return super.getSalario() * 2 + 300;
	}
	


}
