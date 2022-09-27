
package mediaaritmetica;

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
       Scanner alberto = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");
        String name = alberto.next();
        System.out.print("Digite a primeira nota: ");
        double nota1 = alberto.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = alberto.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = alberto.nextDouble();
        double media = calculaMedia(nota1, nota2, nota3);
       
        if(aprovado(media) == true){
           
          
            System.out.println( name + " foi aprovado com média "+media);
        }
        else{
        
            System.out.println( name + " foi reprovado com média "+media);
        }
       
    }
    
    public static double calculaMedia(double a, double b, double c){
      
        return (a+b+c)/4;
    }
    
    public static boolean aprovado(double media){
       
        if(media >= 7){
            return true;
        }
        else{
            return false;
        }
    
    }
}
