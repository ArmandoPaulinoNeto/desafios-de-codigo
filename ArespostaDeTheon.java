package digital.innovation.one.desafios;
import java.util.Scanner;

public class ArespostaDeTheon {
    
    public static void main(String[] arg){
    
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int escolha = 0;
        int valor = 100;
        
        for (int i = 0; i < n; i++) {
            
            int t = scanner.nextInt();
            
            if(t < valor){
                escolha = i+1;
                valor = t;
            }
        }
        System.out.println(escolha);
        scanner.close();
    }
}
