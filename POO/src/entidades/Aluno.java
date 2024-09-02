package entidades;

public class Aluno {
  
  	private Integer id;
	private Integer matricula;
	private String nome;
	private String Status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
	public String toString() {
			return "Aluno [id=" + id + ", matricula=" + matricula + ", nome=" + nome + ", Status=" + Status + "]";
	}
	
}
