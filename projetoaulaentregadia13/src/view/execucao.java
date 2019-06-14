package view;

import javax.swing.JOptionPane;

import model.Professor;

public class execucao {
	
	public static void main (String[]args) {
	
		Professor professor = new Professor();
		
		professor.setNome(JOptionPane.showInputDialog(null,"Nome:"));
		professor.setEndereco(JOptionPane.showInputDialog(null,"Endereço:"));
		professor.setBairro(JOptionPane.showInputDialog(null,"Bairro:"));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null,"Cep:")));
		professor.setCidade(JOptionPane.showInputDialog(null,"Cidade:"));
		professor.setEstado(JOptionPane.showInputDialog(null,"Estado:"));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null,"Rg:")));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null,"Cpf")));
		
		System.out.println(professor.getNome());
		System.out.println(professor.getEndereco());
		System.out.println(professor.getBairro());
		System.out.println(professor.getCep());
		System.out.println(professor.getCidade());
		System.out.println(professor.getEstado());
		System.out.println(professor.getRg());
		System.out.println(professor.getCpf());
		
		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas Disciplinas voce possui?"));
			String disciplinas[] = new String[dis];
			for (int i = 0; i < dis; i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina " + i);
			}
			professor.setDisciplinas(disciplinas);

		} catch (Exception e) {
			e.printStackTrace();

		}

		try {
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cursos voce possui?"));
			String cursos[] = new String[cur];
			for (int i = 0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o cursos " + i);
			}
			professor.setCursos(cursos);

		} catch (Exception e) {
			e.printStackTrace();

		}
		
		try {
			for(int i = 0; i < professor.getDisciplinas().length; i++) {
				System.out.println(professor.getDisciplinas()[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			for(int i = 0; i < professor.getCursos().length; i++) {
				System.out.println(professor.getCursos()[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}
}
