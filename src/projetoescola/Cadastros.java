/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoescola;

import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author laboratorio
 */
public class Cadastros {
// metodo para formuladio de alunos

    public void cadastroAlunos() {
        Aluno alu = new Aluno();
        String nome = JOptionPane.showInputDialog("Insira o nome do Aluno:");
        String idade = JOptionPane.showInputDialog("Insira o Idade do Aluno:");
        String sexo = JOptionPane.showInputDialog("Insira o Sexo do Aluno:");
        String semestre = JOptionPane.showInputDialog("Insira o semestre do Aluno:");
        String turno = JOptionPane.showInputDialog("Insira o turno do Aluno:");
        alu.setNome(nome);
        alu.setIdade(Integer.parseInt(idade));
        alu.setSexo(sexo);
        alu.setSemestre(Integer.parseInt(semestre));
        alu.setTurno(turno);

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session secao = sf.openSession();
        Transaction tr = secao.beginTransaction();// abrir transação
        secao.save(alu);// salvar o objeto   
        tr.commit();// ira executar o que pediu

    }

    public void cadastroProfessor() {
        Professor prof = new Professor(); //criando objetos
        String nome = JOptionPane.showInputDialog("Insira o nome do professor:");
        String idade = JOptionPane.showInputDialog("Insira a idade do professor:");
        String sexo = JOptionPane.showInputDialog("Insira o sexo do professor:");
        String salario = JOptionPane.showInputDialog("Insira o salario do professor:");
        String materia = JOptionPane.showInputDialog("Insira a materia do professor:");

        prof.setNome(nome);
        prof.setIdade(Integer.parseInt(idade));
        prof.setSexo(sexo);
        prof.setSalario(Float.parseFloat(salario));
        prof.setMateria(materia);

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session secao = sf.openSession();
        Transaction tr = secao.beginTransaction();// abrir transação

        secao.save(prof);// salvar o objeto   

        tr.commit();// ira executar o que pediu

        secao.close();

        sf.close();

    }

}
