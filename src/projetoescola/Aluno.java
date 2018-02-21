/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoescola;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author laboratorio
 */
@Entity
public class Aluno extends Pessoa {

    @Id
    @GeneratedValue
    private long id;
    private int semestre;
    private String turno;
    

    
//   public int calculaDtNasciemto(int ano) {
//        return ano - getIdade();
//    }
    public Aluno() {
    }
   
    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}
