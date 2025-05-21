import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int contaVeicoliVecchi(Veicolo[] veicoli, int annoMassimo){
        int contatore = 0;
        for(int i = 0; i < veicoli.length; i++){
            if(veicoli[i].getAnno() <= annoMassimo){
              contatore++;
            }
        }
        return contatore;
    }
    public static void main(String[] args) {
        Veicolo[] v = new Veicolo[3];
        v[0] = new Automobile("Fiat 500", 2020, 5);
        v[1] = new Moto("Yamaha R1", 2021, 998);

        Scanner scanner = new Scanner(System.in);

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int i = 2;
        while (i<v.length) {
            boolean isValid = true;
            do {
                System.out.println("Quale tipo di veicolo inserire? (1 = Automobile, 2 = Moto): ");

                try {
                    int tipo = scanner.nextInt();

                    switch (tipo){
                        case 1:
                            //automobile
                            System.out.print("Modello: ");
                            String modello = br.readLine();
                            System.out.print("Anno: ");
                            int anno = scanner.nextInt();
                            System.out.print("Porte : ");
                            int porte = scanner.nextInt();

                            v[i] = new Automobile(modello, anno, porte);
                            break;
                        case 2:
                            //automobile
                            System.out.print("Modello: ");
                            String modello2 = br.readLine();
                            System.out.print("Anno: ");
                            int anno2 = scanner.nextInt();
                            System.out.print("Cilindrata : ");
                            int cilindrata = scanner.nextInt();

                            v[i] = new Automobile(modello2, anno2, cilindrata);                            //moto
                            break;
                    }
                    i++;
                } catch (Exception e) {
                    isValid = false;
                }
            } while (!isValid);

        }

        for(int j=0;j<v.length;j++){
            System.out.println(v[j].getModello() + " " + v[j].getAnno());
            v[j].StartMotore();
        }
        System.out.println(contaVeicoliVecchi(v,2020));
    }
}