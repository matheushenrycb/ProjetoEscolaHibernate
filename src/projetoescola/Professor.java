package projetoescola;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author laboratorio
 */
@Entity
public class Professor extends Funcionario {

    @Id
    @GeneratedValue
    private long id;
    private String materia;
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
   

    public int calculaDtNasciemto(int ano) {
        return ano - getIdade();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}
