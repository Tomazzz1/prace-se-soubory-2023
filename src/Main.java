import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String NAZEV_SOUBORU = "vstup.txt";
    private static final String ODDELOVAC = ":";

    private static List<Zakaznik> list = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        list.add(new Zakaznik("Karel Dvořák",80));
        list.add(new Zakaznik("Jaromír Veselý",26));
        writeToFile(list,"vystup.txt",":");
        Evidence newEvidence = new Evidence();
        newEvidence.nactiZeSouboru(NAZEV_SOUBORU);
        newEvidence.getEvidence().forEach(zakaznik -> System.out.println(zakaznik.getJmeno() + ODDELOVAC + zakaznik.getPocetProdeju()));

    }
    public static void writeToFile(List<Zakaznik> list, String nazevSouboru, String oddelovac){
        try(PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(nazevSouboru)))) {
            String radek;
            for(Zakaznik zakaznik : list){
                radek = zakaznik.getJmeno() + oddelovac + zakaznik.getPocetProdeju();
                printWriter.println(radek);
            }

        } catch (Exception e) {
            System.err.println("Chyba při zápisu do souboru " + nazevSouboru + ": " + e.getLocalizedMessage());

        }

    }
}