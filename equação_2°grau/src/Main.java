import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		a = sc.nextInt();
		System.out.println("Digite o valor de b: ");
		b = sc.nextInt();
		System.out.println("Digite o valor de c: ");
		c = sc.nextInt();
		sc.close();
		
		double delta = Math.pow(b, 2.0) - 4 * a * c;
		double x1, x2 ;
		x1 = - (b - Math.sqrt(delta)) / ( 2 * a);
		x2 = - (b + Math.sqrt(delta)) / ( 2 * a);
		System.out.printf("O delta é: %.0f\n", delta);
		System.out.printf("E os valores de x1 e x2 são:\n%.1f\n%.1f", x1,  x2);
	}
	
}
		
		
		
