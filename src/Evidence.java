
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Evidence {
    public static final String ODDELOVAC = ":";

    List<Zakaznik> evidence = new ArrayList<>();

    public void nactiZeSouboru(String nazevSouboru) {
        String nextLine = "";
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader(nazevSouboru)))) {
            while (scanner.hasNextLine()) {
                nextLine = scanner.nextLine();
                String[] polozky = nextLine.split(ODDELOVAC);
                String jmeno = polozky[0].trim();
                Integer pocet = Integer.parseInt(polozky[1].trim());
                Zakaznik zakaznik = new Zakaznik(jmeno,pocet);
                evidence.add(zakaznik);

            }
        } catch (Exception e) {
            throw new RuntimeException("Chyba při načtení ze souboru " + nazevSouboru + ": " + e.getLocalizedMessage());
        }
    }
    public List<Zakaznik> getEvidence(){return new ArrayList<>(evidence);}
}