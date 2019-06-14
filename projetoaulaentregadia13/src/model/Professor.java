package model;

public class Professor extends Funcionario{
	private String []disciplinas;
	private String []cursos;
	public String[] getDisciplinas() {
		return disciplinas;
	}
	public void setDisciplinas(String[] disciplinas) {
		this.disciplinas = disciplinas;
	}
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	@Override
	public double aumentoSalarial(double horaAula, double aumento) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
