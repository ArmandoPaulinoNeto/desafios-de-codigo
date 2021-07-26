package digital.innovation.one.desafios;
import java.io.IOException;
import java.util.Scanner;

public class Divisores {
	
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
