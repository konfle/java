// InteligentnyPowielacz.java
import java.io.*;
public class InteligentnyPowielacz {
	public static void main(String[] args) throws IOException {
		BufferedReader wej = new BufferedReader (
			new InputStreamReader(System.in));
		System.out.print("Podaj nazwe klasy: ");
		String klasa = wej.readLine();
		System.out.print("Podaj tekst: ");
		String tekst = wej.readLine();
		System.out.println("public class " + klasa + " { \n \t public static void main(String[] args) {\n \t \t System.out.println('" + tekst + "'); \n \t } \n }");
	}
}