// KtoTyJestes.java
import java.io.*;
public class KtoTyJestes {
public static void main(String[] args) throws IOException {
BufferedReader wej = new BufferedReader(
new InputStreamReader(System.in));
System.out.print("Podaj imie: ");
String imie = wej.readLine();
System.out.println("Witaj " + imie + "!");
}
}