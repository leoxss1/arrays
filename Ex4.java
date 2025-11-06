// Leonardo xavier santana santos
import java.util.Scanner; 
public class Ex4 {
    
public static boolean isPar(int numero) {
 return  numero  % 2 == 0;
}
public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
   while (true){
   System.out.println( "digite um numero inteiro:");
     
   int numero = leitor.nextInt();
    
   if(isPar (numero)){
System.out.println(numero + "  é par");
    }else{
        System.out.println(numero + " é impar");
    }
    
}
}
}
