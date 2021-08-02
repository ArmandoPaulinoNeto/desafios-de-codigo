package digital.innovation.one.desafios;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ValorMetadeAnterior {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        BigDecimal[] valores = new BigDecimal[100];

        valores[0] = new BigDecimal(valor);

        for (int i = 1; i < 100; i++) {

          valores[i] = valores[i-1].divide(new BigDecimal(2));
        }
        for (int i = 0; i < 100; i++) {

          System.out.println(String.format("N[" + i + "] = %.4f", valores[i].setScale(4, RoundingMode.HALF_EVEN)));
        }
    }
}
