public class Automobile implements Veicolo{
    private  int anno, porte;
    private String modello;
    public Automobile(String modello, int anno, int porte) {
        this.modello = modello;
        this.anno = anno;
        this.porte = porte;
    }

    @Override
    public String getModello() {
        return modello;
    }

    @Override
    public int getAnno() {
        return anno;
    }

    public int getPorte() {
        return porte;
    }

    @Override
    public void StartMotore() {
        System.out.println("\uD83D\uDE97 Motore acceso: Brrrum!");
    }
}
