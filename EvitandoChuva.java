package digital.innovation.one.desafios;

import java.io.IOException;
import java.util.Scanner;

public class EvitandoChuva {
    public static void main(String[] args) throws IOException {
       
        Scanner scanner = new Scanner(System.in);
        int dias = scanner.nextInt();
        int casaComprado = 0;
        int casaSobrando = 0;
        int trabComprado = 0;
        int trabSobrando = 0;
        
        for (int i = 0; i < dias; i++){
            
            String casa = scanner.next();          
            String trabaho  = scanner.next();

            if(casa.equals("chuva") && casaSobrando == 0){
                casaComprado++;
                trabSobrando++;                
            }if(casa.equals("chuva") && casaSobrando > 0){                    
                casaSobrando--;
                trabSobrando++;
            }if(trabaho.equals("chuva") && trabSobrando == 0){                   
                trabComprado++;
                casaSobrando++;
            }if(trabaho.equals("chuva") && trabSobrando > 0){                   
                trabSobrando--;
                casaSobrando++;
            }
            System.out.println(casaComprado + " " + trabComprado);
        }
    }
}
