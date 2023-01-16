

public class Zakaznik {
    private String jmeno;
    private int pocetProdeju;

    public Zakaznik(String jmeno, int pocetProdeju) throws Exception {
        this.jmeno = jmeno;
        this.pocetProdeju = pocetProdeju;
        this.setPocetProdeju(pocetProdeju);
        this.zvysPocetProdeju(pocetProdeju);
    }

    public void zvysPocetProdeju(int pocetProdeju) throws Exception {
        if (zvysPocetProdeju <=0){
            throw new RuntimeException("Špatně nastavené číslo"+
                    pocetProdeju + "! Číslo musí být >=0");
        }

    }
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public int getPocetProdeju() {
        return pocetProdeju;
    }

    public void setPocetProdeju(int pocetProdeju) {
        this.pocetProdeju = pocetProdeju;
    }

}
