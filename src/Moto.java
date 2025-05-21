public class Moto implements Veicolo{
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
        System.out.println("\uD83C\uDFCD\uFE0F Motore acceso: Brrrum!");
    }
}
