import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner alberto = new Scanner(System.in);
        System.out.println(Digite a primeira nota);
        double nota1 = alberto.nextDouble();
        System.out.println(Digite a segunda nota);
        double nota2 = alberto.nextDouble();
        System.out.println(Digite a terceira nota);
        double nota3 = alberto.nextDouble();
        System.out.println(Digite a quarta nota);
        double nota4 = alberto.nextDouble();
        double media = calculaMedia(nota1, nota2, nota3, nota4);
        if(aprovado(media) == true){
            System.out.println(O aluno foi aprovado com média +media);
        }
        else{
            System.out.println(O aluno foi reprovado com média +media);
        }
    }
    public static double calculaMedia(double a, double b, double c, double d){
        return (a+b+c+d)/4;
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
