
public class Endereco {
	private String rua;
	private String numero;
	private String complemento;
	private String cidade;
	
	public Endereco() {
		this.rua = "";
		this.numero = "";
		this.complemento = "";
		this.cidade = "";
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String imprimirEndereco() {
		return("Rua: "+this.getRua()+", "+this.getNumero()+
				" - "+this.getCidade()+", Complemento: "+this.getComplemento());
	}
}
