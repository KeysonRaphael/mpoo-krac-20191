
public class Aluno{
	private int anoEntrada;
	private int periodoEntrada;
	private Pessoa pessoa;
	
	public int getAnoEntrada() {
		return anoEntrada;
	}
	public void setAnoEntrada(int anoEntrada) {
		this.anoEntrada = anoEntrada;
	}
	public int getPeriodoEntrada() {
		return periodoEntrada;
	}
	public void setPeriodoEntrada(int periodoEntrada) {
		this.periodoEntrada = periodoEntrada;
	}
	public void imprimir() {
		System.out.println("Aluno: " + this.getPessoa().getNome() + ", CPF: "+ 
				this.getPessoa().getCpf() + " , Ano de entrada: " + this.getAnoEntrada()+
				" , Periodo de entrada: " + this.getPeriodoEntrada()+ ", Endereço: " + 
				this.getPessoa().getEndereco().imprimirEndereco());
	}
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
