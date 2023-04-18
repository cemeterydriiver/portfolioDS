
package venda;

import java.util.Scanner;

public class Venda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome:");
        String nome=scanner.nextLine();
        System.out.print("Salario:");
        float sala=scanner.nextFloat();
        System.out.print("Vendas do mes:");
        double vend=scanner.nextFloat();
        double soma= (vend*15)/100;
        double soma2=soma+sala;
        System.out.println("Nome:" + nome );
        System.out.println("Salario:" + sala );
        System.out.println("Salario com vendas:" + soma2);
    }
    
}
