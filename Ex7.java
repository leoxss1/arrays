// Leonardo xavier santana santos
import java.util.Scanner;
public class Ex7 {
    

    public static int calcularFatorial(int numero){
  int fatorial = 1;
     for(int i =2; i <= numero; i++){
       fatorial*=i;
     }
     return fatorial;

    }
    
    
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO INTEIRO:");
        int numero = leitor.nextInt();

        int resultado= calcularFatorial(numero);

            System.out.println(" o fatorial de " + numero + " é " + resultado);
        
    }
}
