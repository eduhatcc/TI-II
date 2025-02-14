package unidade01;

import java.util.Scanner;

public class SomarDoisNumeros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean fim = false;
		String resp;
		int n1 = 0,
			n2 = 0,
			soma = 0;
		
		do {
			System.out.printf("%nDigite o primeiro número: ");
			n1 = sc.nextInt();
			System.out.printf("%nDigite o segundo número: ");
			n2 = sc.nextInt();
		
			soma = n1 + n2;
		
			System.out.printf("%n%d + %d = %d%n", n1, n2, soma);
			
			System.out.printf("%nDeseja finalizar o programa? [S/N]: ");
			resp = sc.next();
			
			if (resp.equals("s")) {
				fim = true;
			}
			else {
				n1 = 0;
				n2 = 0;
				soma = 0;
			}
		}
		while(!fim);
		
		sc.close();
	}
}
