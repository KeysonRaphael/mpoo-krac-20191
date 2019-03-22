
public class Pessoa {
	private String nome;
	private String cpf;
	private Endereco endereco;
	
	public Pessoa() {
		this.nome = "";
		this.cpf = "";
		this.endereco = new Endereco();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(String rua,String numero,String complemento, String cidade) {
		this.endereco.setRua(rua);
		this.endereco.setCidade(cidade);
		this.endereco.setComplemento(complemento);
		this.endereco.setNumero(numero);
	}
}
