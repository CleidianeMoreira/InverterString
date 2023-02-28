import java.util.Scanner;

public class CaracteresInvertidosDeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fraseInversa = "";
		String frase = sc.nextLine();
		char fraseVetor[] = frase.toCharArray();
		
		for(int i =1; i <= frase.length();i++) {
			fraseInversa += fraseVetor[frase.length()-i];
		}
		System.out.println(fraseInversa);
		sc.close();
	}

}
