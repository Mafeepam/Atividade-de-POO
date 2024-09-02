package base_Dados;

import java.util.ArrayList;
import java.util.List;
import entidades.Aluno;
import entidades.Departamento;
import entidades.Disciplina;
import entidades.Laboratorio;
import entidades.Professor;

public class Base implements IBase {

	private final Integer

	QTDE_DEPARTAMENTOS = 3,
	QTDE_PROFESSORES = 15,
	QTDE_LABORATORIOS = 12;


	private List<Laboratorio> laboratorios;
	private List<Departamento> Departamentos;
	private List<Disciplina> Disciplina;
	private List<Professor> Professores;
	private List<Aluno> Alunos;


	private void laboratorios() {
		this.laboratorios = new ArrayList<Laboratorio>();
		Laboratorio lab;
		for (int i = 0, ctle = 0; i < QTDE_LABORATORIOS; i++, ctle++) {
			lab = new Laboratorio();
			lab.setId(ctle);
			if(ctle == 1 || ctle == 10) {
			lab.setCapacidade(15);
			} else if(ctle >=2 && ctle <= 7) {
				lab.setCapacidade(20);
			} else if(ctle >7 &&  ctle <=9 || ctle > 10 && ctle <=12) {
				lab.setCapacidade(15);
			}
			lab.setStatus(false);
			this.laboratorios.add(lab);
		}
	}

	@Override
	public List<Departamento> getDepartamentos() {
		
		return null;
	}

	@Override
	public List<Disciplina> getDisciplina() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Laboratorio> getlaboratorios() {
		laboratorios();
		return this.laboratorios;
	}

	@Override
	public List<Professor> getProfessores() {
		
		return null;
	}

	@Override
	public List<Aluno> getAlunos(int qtde, int inicio) {
		// TODO Auto-generated method stub
		return null;
	}
}
