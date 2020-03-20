// Kelner.java
import java.io.*;
public class Kelner {
public static void main(String[] args) throws IOException {
	BufferedReader wej = new BufferedReader (
		new InputStreamReader(System.in));
	System.out.print("Podaj promien podstawy beczki: ");
		String PromienPodstawy = wej.readLine();
	System.out.print("Podaj wysokosc beczki: ");
		String WysokoscBeczki = wej.readLine();
	System.out.print("Podaj objetosc kieliszka: ");
		String ObjetoscKieliszka = wej.readLine();
	System.out.println("Wysokosc beczki to " + WysokoscBeczki + ", promien podstawy beczki to " + PromienPodstawy + " a objetosc kieliszka to " + ObjetoscKieliszka );
		int podstawa = Integer.parseInt(PromienPodstawy);
		int wysokosc = Integer.parseInt(WysokoscBeczki);
		int objetosc = Integer.parseInt(ObjetoscKieliszka);
		/* System.out.println("Dane: " + podstawa + wysokosc + objetosc); */
		double IloscKieliszkow = (Math.PI * podstawa * podstawa * wysokosc) / objetosc;
		int wynik = (int) IloscKieliszkow;
	System.out.println("Z tej beczki napelnisz " + wynik + " pelne kieliszki");				
	}
}