package harjoitukset.git_ryhmis;

import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {

            outer:
            for (;;) {

                System.out.println("Mitä peliä haluat pelata?\n"
                        + "A - Tietovisa\n"
                        + "B - Kysymykset\n"
                        + "C - TiedostoKysymysTesti\n"
                        + "X - Lopeta\n");

                String valinta = in.nextLine();

                switch (valinta) {
                    case "A":
                    case "a":
                        Tietovisa.pelaa();
                        continue;
                    case "B":
                    case "b":
                        Kysymys.pelaa();
                        continue;
                    case "C":
                    case "c":
                        TiedostoKysymysTesti.pelaa();
                        continue;
                    case "X":
                    case "x":
                        System.out.println("Lopetetaan.");
                        break outer;
                    default:
                        System.out.println("Valitse jokin peli tai lopetus!\n"
                                + "(Press Enter to continue)\n");
                }
            }

        }
    }

}
