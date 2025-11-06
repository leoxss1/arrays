// Leonardo xavier santana santos
import java.util.Scanner;
public class Ex6 {

        public static int MaiorValor(int[] vetor) {
    
    int maior = vetor[0];
    for(int i = 1; i < vetor.length; i++){
     if(vetor [i] >  maior){
        maior = vetor[i];
     }
    } 
    return maior;
   }
     public static int MenorValor(int[] vetor){
    
    int menor = vetor [0];
    for(int i = 1; i < vetor.length; i++){
    if (vetor [i] < menor){
        menor= vetor[i];
    }
   }return menor;
}

       public static double MediaMaxMin(int[] vetor){
    int max = MaiorValor(vetor);
    int min = MenorValor(vetor);
  return (max + min)/2.0;

   }
 
     public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
     System.out.println("digite dois numeros inteiros:"); 
     int[] numeros = new int[2]; 
     numeros [0] = leitor.nextInt();
     numeros [1] = leitor.nextInt();
     
    System.out.println("Maior valor: " + MaiorValor(numeros));
        System.out.println("Menor valor: " + MenorValor(numeros));
        System.out.println("Média: " + MediaMaxMin(numeros));
 }
}