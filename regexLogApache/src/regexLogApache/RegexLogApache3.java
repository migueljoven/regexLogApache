
// package RegexLogApache // Descomentar en eclipse

// javac RegexLogApache
// cat log.txt | java RegexLogApache
// cat log.txt | java RegexLogApache > ficherosalida.txt
//


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexLogApache3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// Cadena en la que buscar el patron
		String input = "";
		while (in.hasNext())
			input += in.next();
		in.close();
		// Cadena en la que buscar el patron

		// Mostrar la cadena
		System.out.println();
		System.out.println("Cadena INPUT:\n"+input);


		// PATRON a buscar
		final String PATRON_MOZILLA = "Mozilla";
		final String PATRON_SAFARI = "Safari";

		// Generamos el objeto Pattern y Matcher
		Pattern patron1 = Pattern.compile(PATRON_MOZILLA);
		Pattern patron2 = Pattern.compile(PATRON_SAFARI);

		Matcher matcher1 = patron1.matcher(input);
		Matcher matcher2 = patron2.matcher(input);

		int contador1 = 0;
		while (matcher1.find()) {
			contador1++;
		}
		int contador2 = 0;
		while (matcher2.find()) {
			contador2++;
		}
		System.out.println();
		System.out.println("Numero de Mozilla: "+contador1);
		System.out.println("Numero de Safari: "+contador2);

	}
}


