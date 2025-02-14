package unidade01;

import java.util.Scanner;

public class SomarDoisNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0,
			n2 = 0,
			soma = 0;
		
		System.out.printf("Digite o primeiro número: ");
		n1 = sc.nextInt();
		System.out.printf("%nDigite o segundo número: ");
		n2 = sc.nextInt();
		
		soma = n1 + n2;
		
		System.out.printf("%n%n%d + %d = %d", n1, n2, soma);
		
		sc.close();
	}
}
