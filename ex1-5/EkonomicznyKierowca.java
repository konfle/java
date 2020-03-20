// EkonomicznyKierowca.java
import java.io.*;
public class EkonomicznyKierowca {
public static void main(String[] args) throws IOException {
	BufferedReader wej = new BufferedReader (
		new InputStreamReader(System.in));
	System.out.print("Podaj liczbe kilometrow do przejechania: ");
		String Kilometry = wej.readLine();
	System.out.print("Podaj srednie zuzycie paliwa na 100km: ");
		String SrednieSpalanie = wej.readLine();
	System.out.print("Podaj cene paliwa: ");
		String CenaPaliwa = wej.readLine();
	System.out.println("Trasa ma " + Kilometry + "km, srednie spalanie na 100 km to " + SrednieSpalanie + " litrow, a za litra paliwa zaplacono " + CenaPaliwa + " PLN" );
		int IloscKilometry = Integer.parseInt(Kilometry);
		int Spalanie = Integer.parseInt(SrednieSpalanie);
		int	Cena = Integer.parseInt(CenaPaliwa);
		double Koszt = ((IloscKilometry / 100 ) * Spalanie) * Cena;
		/*int wynik = (int) Koszt;*/
	System.out.println("Cena za przejazd trasy to " + Koszt + " PLN");				
	}
}