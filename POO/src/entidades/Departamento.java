package entidades;

public class Departamento {

  private Integer id;
	private String sigla;
	private String descricao;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String toString() {
		return "Departamento [id=" + id + ", sigla=" + sigla + ", descricao=" + descricao + "]";
	}
}
