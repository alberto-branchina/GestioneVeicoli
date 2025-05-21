import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veicolo[] v = new Veicolo[10];
        v[0] = new Automobile("Fiat 500", 2020, 5);
        v[1] = new Moto("Yamaha R1", 2021, 998);

        Scanner scanner = new Scanner(System.in);

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
                            String modello = scanner.nextLine();
                            System.out.print("Anno: ");
                            int anno = scanner.nextInt();
                            System.out.print("Porte : ");
                            int porte = scanner.nextInt();

                            v[i] = new Automobile(modello, anno, porte);
                            break;
                        case 2:
                            //automobile
                            System.out.print("Modello: ");
                            String modello2 = scanner.nextLine();
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
    }
}