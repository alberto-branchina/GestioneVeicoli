public class Moto implements Veicolo{
    private String modello;
    private int anno, cilindrata;
    public Moto(String modello, int anno, int cilindrata) {
        this.modello = modello;
        this.anno = anno;
        this.cilindrata = cilindrata;
    }
    @Override
    public String getModello() {
        return modello;
    }

    @Override
    public int getAnno() {
        return anno;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    @Override
    public void StartMotore() {
        System.out.println("\uD83C\uDFCD\uFE0F Motore acceso: Brrrum!");
    }
}
