package base_Dados;

import java.util.List;

import entidades.Aluno;
import entidades.Departamento;
import entidades.Disciplina;
import entidades.Laboratorio;
import entidades.Professor;

public interface IBase {
	
	List<Laboratorio> getlaboratorios();
	List<Departamento> getDepartamentos();
	List<Disciplina> getDisciplina();
	List<Professor> getProfessores();
	List<Aluno> getAlunos(int qtde, int inicio);

}
