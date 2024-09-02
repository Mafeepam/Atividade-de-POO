package entidades;

public class Professor extends Pessoa{
	
	private Integer id;
	private String nome;
	private String status;
	private Departamento departamento;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	public String toString() {
		return "Professor [id=" + id + ", nome=" + nome + ", status=" + status + ", departamento=" + departamento + "]";
	}
	
}
