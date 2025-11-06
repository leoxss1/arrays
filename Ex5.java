// Leonardo xavier santana santos
import java.util.Scanner;
public class Ex5 {

    public static String exibirDiaSemana(int dias){

        switch (dias) {
        case 1:
          return "domingo";
          
        case 2:
          return "segunda";
           
        case 3:
          return "terça";
           
        case 4:
          return "quarta";
            
        case 5:
          return "quinta";
            
        case 6:
          return"sexta";
           
        case 7:
          return "sabado";
         
         default:
         
         return "Dia da semana inválido. (apenas de 1 a 7)";
        }
      
  }
  public static void main(String[] args) {
     Scanner leitor = new Scanner(System.in);
                
     System.out.println("Escolha um numero inteiro de 1 a 7");
              int numero = leitor.nextInt();
            

             String resultado = exibirDiaSemana(numero);
             System.out.println(resultado);

        
 }
}
