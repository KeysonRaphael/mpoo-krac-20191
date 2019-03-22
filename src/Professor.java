import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Professor{
	private Date admissao;
	private Pessoa pessoa;
	
	public Date getAdmissao() {
		return admissao = null;
	}

	public void setAdmissao(int ano, int mes, int dia) {
		Calendar data = Calendar.getInstance();
		data.set(ano, mes-1, dia);
		this.admissao = data.getTime();
	}
	
	public void imprimir() {
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String time= "";
		if(this.admissao != null) {
			time = dateFormat.format(this.admissao);
	    }
		System.out.println("Professor: " + this.getPessoa().getNome() + ", CPF: "+ 
				this.getPessoa().getCpf() + " , Data Admissao: " + time + ", Endereço: " + 
				this.getPessoa().getEndereco().imprimirEndereco());
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
