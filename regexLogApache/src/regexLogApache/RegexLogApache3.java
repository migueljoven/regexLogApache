
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


		/*
		String cadena1 = '31.184.238.174 - - [24/Jan/2016:16:05:49 -0800] 'GET /logs/access.log HTTP/1.1' 200 481263 'http://gravatar.com/1rdilantin100mg' 'Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.107 Safari/537.36' 'redlug.com'
		212.92.232.129 - - [24/Jan/2016:16:10:49 -0800] 'GET /logs/access_130930.log HTTP/1.1' 404 73 'http://www.purevolume.com/prednisona' 'Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.10.229 Version/11.64' 'redlug.com'
		212.92.232.129 - - [24/Jan/2016:16:10:52 -0800] 'GET /access_130930.log HTTP/1.1' 404 73 'http://www.purevolume.com/prednisona' 'Opera/9.80 (Windows NT 6.1; U; ru) Presto/2.10.229 Version/11.64' 'redlug.com'
		31.184.238.174 - - [24/Jan/2016:16:14:04 -0800] 'GET /logs/access.log HTTP/1.1' 200 668 'http://www.purevolume.com/trazodone25mgorderonline' 'Mozilla/5.0 (Windows NT 6.2; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.76 Safari/537.36' 'redlug.com'
		100.43.85.19 - - [24/Jan/2016:16:14:40 -0800] 'GET /logs/access_140901.log HTTP/1.1' 200 47452 '-' 'Mozilla/5.0 (compatible; YandexBot/3.0; +http://yandex.com/bots)' 'redlug.com'
		93.127.146.206 - - [24/Jan/2016:16:17:10 -0800] 'GET / HTTP/1.1' 200 1269 'http://redlug.com' 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/39.0.2171.95 Safari/537.36' 'redlug.com'
		31.184.238.174 - - [24/Jan/2016:16:23:36 -0800] 'GET /logs/access.log HTTP/1.1' 200 1342 'http://gravatar.com/scheepmiddmatmaherrrep' 'Mozilla/5.0 (Windows NT 5.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.76 Safari/537.36' 'redlug.com'
		31.184.238.174 - - [24/Jan/2016:16:30:25 -0800] 'GET /logs/access.log HTTP/1.1' 200 1593 'http://buy-telmisartan-40mg-2014.over-blog.com/2014/04/telmisartan-20mg-buy-safely-purchasing-telmisartan-online-for-cheap.html' 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/32.0.1700.107 Safari/537.36' 'redlug.com'';
		 */

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


