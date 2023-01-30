package Uri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int km;
		double litros, consumo;
		
		km = sc.nextInt();
		litros = sc.nextDouble();
		
		consumo = km / litros;
		
		System.out.printf("%.3f km/l%n", consumo);		
						
		sc.close();

	}

}
