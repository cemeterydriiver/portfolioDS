
package aulavetor01;
import javax.swing.JOptionPane;
public class AulaVetor01 {

    public static void main(String[] args) {
        
       //=================MEU CÓDIGO ESTA ABAIXO DO CÓDIGO FEITO EM SALA====================!//
        
      //Código feito em sala:
      
        /* // String[] nomes = new String[3];
       // nomes[0] = "Javackson";
       // nomes[1] = "javana";
       // nomes[2] = "MC Rosinha";
       //String[] palavras = {"Netbeanséfoda","digaNAOaUbuntu!","vivaJS","javaévida"};
       //JOptionPane.showMessageDialog(null, nomes[2]+palavras[1]); 
       //String[][] matrix = new String[3][3];
       
       int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho"));
       String[] vishnu = new String[tamanho];
       int pos = 0;
       while (pos < tamanho){
           vishnu[pos] = JOptionPane.showInputDialog("Digite a palavra da posição "+pos);
           pos ++;
       }
       pos = 0;
       String resultado = "";
       while (pos < tamanho){
          resultado+= vishnu[pos]+" ";
          pos ++;
       }
       JOptionPane.showMessageDialog(null, resultado);*/
        
       //Meu código:
      String nomes[] = {"Javackson", "Javana", "MC rosinha"};
      String frases[] = {"NetBeans supremacy", "Não ao ubunto!", "JavaScript supremacy!", "Aprendendo vetores"};
      
      for(int a = 0; a <= 5; a++){
          System.out.println(nomes [a]); //mostra os valores do vetor
            System.out.println("Na posição: " + a + "Temos o valor: "+ nomes[a]); //mostra a posição dos nomes
            System.out.println("Na posição: " + a + "Temos o valor: "+ frases[a]); //mostra a posição das frases
            
      }
      
    }
    
}
