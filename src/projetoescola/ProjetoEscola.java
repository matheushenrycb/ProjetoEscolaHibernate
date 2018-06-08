package projetoescola;

//import javax.swing.JOptionPane;


/**
 *
 * @author laboratorio
 */
public class ProjetoEscola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cadastros cadAluno = new Cadastros();
        cadAluno.cadastroAlunos();
        Cadastros cadProf = new Cadastros();
        cadProf.cadastroProfessor();
        System.out.println("teste na linha 22");
        
        
        // busca a configuração do arquivo hibernate 

//         Professor professor = new Professor();
//        Aluno aluno = new Aluno();
//                
//        int anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Insira o ano atual"));        
//        professor.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do professor: ")));
//        aluno.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Insira a idade do aluno: ")));
//        
//        int anoAluno=  aluno.calculaDtNasciemto(anoAtual);
//        int anoProf = professor.calculaDtNasciemto(anoAtual);
//        
//        JOptionPane.showMessageDialog(null , "A ano de nascimento do professor é: " + anoProf + "\nA ano de nascimtno do aluno: " + anoAluno);
    }

}
