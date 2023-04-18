
package objetos;

import java.util.ArrayList;
import java.util.function.Consumer;
import javax.swing.JOptionPane;

public class Objetos {

   
    public static void main(String[] args) {
        cadastraAluno();
    }
    public static void cadastraAluno() {
        int qnt = Integer.parseInt(JOptionPane.showInputDialog("Quantos alunos deseja cadastrar?"));
        ArrayList<Aluno> lista = new ArrayList<>();
        for (int i = 0; i < qnt; i++) {
            String matricula = JOptionPane.showInputDialog("Digite a matricula: ");
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade de: " + nome));
            String cpf = JOptionPane.showInputDialog("Digite o CPF de: " + nome);
            Aluno p = new Aluno(matricula, nome, idade, cpf);
            lista.add(p);
        }
        lista.forEach((Aluno a) ->{
            JOptionPane.showMessageDialog(null,"Nome: "+a.getNome()+
             "\nIdade: "+a.getIdade()+"\nCPF: "+a.getCpf()+"\nMatricula: "+a.getMatricula());
        });

    }
}
