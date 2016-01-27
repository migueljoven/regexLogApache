//package ejemplosClaseCharacter;

import java.util.Scanner;

public class EjemploClaseCharacter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = "";
		//
		while(in.hasNext()){
			input += in.next();
		}
		in.close();
		// Convetir el String a un array de char
		char[] arrayChar = input.toCharArray();
		// Recorremos para contar el numero 
		int contadorLetras = 0;
		int contadorNumeros = 0;
		int contadorSimbolos = 0;
		for (char c : arrayChar) {
			if (Character.isDigit(c))
				contadorNumeros++;
			else if(Character.isLetter(c))
				contadorLetras++;
			else
				contadorSimbolos++;
		}
		System.out.printf("%s %d %s %d %s %d%n", "Dígitos: ", contadorNumeros,"Letras: ", contadorLetras, "Simbolos: ", contadorSimbolos );
	}

}
