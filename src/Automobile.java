public class Automobile implements Veicolo{
    private int modello, anno, porte;

    public Automobile(int modello, int anno, int porte) {
        this.modello = modello;
        this.anno = anno;
        this.porte = porte;
    }

    @Override
    public String getModello() {
        return "";
    }

    @Override
    public int getAnno() {
        return 0;
    }

    @Override
    public void StartMotore() {
        System.out.println("\uD83D\uDE97 Motore acceso: Brrrum!");
    }
}
