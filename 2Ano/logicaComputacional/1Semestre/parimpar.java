import java.util.Scanner;

public class Main{
		String P=par;
		String I =impar;

	public static void main(String[] args) {
		int var1;
	    Scanner e = new Scanner(System.in);
    System.out.println(Digite o valor desejado: );
            var1 = e.nextInt();   
		
		if (var1 % 2 == 0 && var1 < 100 ){ 
				 
		     System.out.println(o numero +var1+ é par , e menor do que 100);   
		}
		if(var1 % 2 == 1 && var1 > 100){
		     System.out.println(o numero +var1+  é impar,e é maior do que 100);
		}
		if(var1 % 2 == 0 && var1 > 100){
		    System.out.println(o numero +var1+  é par,e é maior do que 100);

		}
		if(var1 % 2 == 1 && var1 < 100) {
		    System.out.println(o numero +var1+  é impar,e é menor do que 100);
		}
		else{
	  System.out.println(Você digitou um valor invalido);
		
		}
	
   
		}
	    
	}
