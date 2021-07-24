package digital.innovation.one.desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SundayMorning {
   
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        List<String> saida = new ArrayList<>();
        
        while (leitor.hasNext()) {
            
            String linha = leitor.nextLine();
            String[] relogio = linha.split(":");
            int hora = Integer.parseInt(relogio[0]);
            int min = Integer.parseInt(relogio[1]);
            
            int atraso = ((hora * 60) + min + 60) - 480;
            
            if(atraso < 0){
                atraso = 0;
            }
            saida.add("Atraso maximo: " + atraso);            
        }
        saida.stream().forEach((saida1) -> {
            System.out.println(saida1);
        });
    }    
}
