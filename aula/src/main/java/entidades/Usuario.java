package entidades;

public class Usuario {

	String nome;
	String senha;
	String email;
	String idade;

	public Usuario(String nome, String senha, String email, String idade) {
		super();
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public Object vernome() {
		this.nome = "massa";
		// TODO Auto-generated method stub
		return nome;
	}

}
