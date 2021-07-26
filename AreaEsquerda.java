package digital.innovation.one.desafios;
import java.io.IOException;
import java.util.Scanner;

public class AreaEsquerda {
	
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);                
        char O = scanner.next().toUpperCase().charAt(0);        
        double[][] M = new double[12][12];
        double soma = 0;
        int d = 0;
        for(int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                M[i][j] = scanner.nextDouble();
            }
        }
        for(int i = 1; i < 11; i++) {
            if(i < 6){
                d = i;
            }else if(i > 6){
                d--;
            }               
            for(int j = 0; j < d; j++){
                soma += M[i][j];
            }            
        }
        if(O == 'M'){
           soma = soma/30;
        }        
    	System.out.println(String.format("%.1f", soma));
    }
}
