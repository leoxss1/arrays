// Leonardo xavier santana santos
import java.util.Scanner;

public class Ex3 {
   
    
        public static int encontrarMax(int n1, int n2) {
    
     if (n1>n2){
     return n1;

    }else {
        return n2;
    }
    } public static void main(String[] args) {
         System.out.println("digite dois numeros:");
        Scanner leitor = new Scanner(System.in);
        
        int n1 = leitor.nextInt();
        
        int n2 = leitor.nextInt();
    
        int n3 = encontrarMax(n1,n2);
       
        System.out.println("O maior valor é: " + n3);

    }
}
