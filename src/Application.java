
public class Application {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Keyson");
		pessoa.setCpf("100.000.000-00");
		pessoa.setEndereco("Rua São Paulo", "10", "casa", "Paulista");
		Aluno aluno = new Aluno();
		aluno.setPessoa(pessoa);
		aluno.setAnoEntrada(2014);
		aluno.setPeriodoEntrada(2);
		aluno.imprimir();
		Professor professor = new Professor();
		professor.setPessoa(pessoa);
		professor.setAdmissao(2022, 01, 01);
		professor.imprimir();
		
	}
}
