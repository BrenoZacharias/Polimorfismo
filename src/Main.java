
public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome="João";
		f1.setSalario (1000);
		imprimirBonus( f1);
				
		Telefonista t1= new Telefonista();
		t1.setNome("Isa");
		t1.setSalario(1000);
		imprimirBonus( t1);
		
		Engenheiro e1 = new Engenheiro();
		e1.nome = "Paola Olive Costa";
		//e1.salario = 3000;
		e1.setSalario(3000);
		e1.crea = 33;
		imprimirBonus(e1);

		EngSW esw = new EngSW();
		esw.nome = "Kleo Von Dix";
		esw.setSalario(4000);
		esw.linguagem = "Assembly";
		imprimirBonus(esw);
		
		Motorista m1 = new Motorista();
		m1.nome = "Ian Von Dix";
		m1.setSalario (1000);
		m1.CNH = "1234";
		imprimirBonus(m1);

	}

	private static void imprimirBonus(Funcionario f1) {
		System.out.println("Nome: " + f1.getNome() + " Salario: " 
	+ f1.getSalario() + " Bonus: " + f1.boni());
		
	}

}
