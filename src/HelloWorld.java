import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
	private String nome;
	private String sobrenome;
	
	public HelloWorld() {
		this.nome = "";
		this.sobrenome = "";
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public void imprimir() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	    Date date = new Date();
	    String time = dateFormat.format(date);
		System.out.println(time + " - Hello " + getNome() +" "+ getSobrenome()+ ". Você acabou de "
				+ "fazer seu primeiro Hello World em Java Parabéns.");
	}
}
