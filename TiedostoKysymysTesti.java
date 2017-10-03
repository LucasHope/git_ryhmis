
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TiedostoKysymysTesti {

    static boolean luettu = false;
    static List<TiedostoKysymys> lista = new ArrayList<>();
    static List<String> rivit = new ArrayList<>();
    private static final String polku = "src/harjoitukset/git_ryhmis/file/kysymykset.txt";

    public static void pelaa() {

        Scanner lue = new Scanner(System.in);

        outer:
        for (;;) {
            System.out.println("\nHaluatko lisätä Tiedostokysymyksiin lisää kysymyksiä? (k/e)");

            String vastaus = lue.nextLine();

            switch (vastaus) {
                case "k":
                case "K":
                    System.out.println("");
                    lisaaKysymys();
                    continue;
                case "e":
                case "E":
                    System.out.println("Aloitetaan siis peli:\n"
                            + "(Press Enter to continue)\n");
                    lue.nextLine();
                    break outer;
                default:
                    System.out.println("Et siis halunnut lisätä kysymyksiä. Aloitetaan peli:\n"
                            + "(Press Enter to continue)\n");
                    lue.nextLine();
                    break outer;

            }
        }

        if (!luettu) {
            lueTiedosto();
        }

        Collections.shuffle(lista);

        int pisteet = 0;
        int kysytty = 0;

        int kysymyksia;

        System.out.println("Montako kierrosta haluat pelata? (max " + lista.size() + " kierrosta!)");
        kysymyksia = Integer.parseInt(lue.nextLine());

        if (kysymyksia == 0) {
            System.out.println("Selvä, palaa pian pelaamaan!\n");
            return;
        }

        System.out.println("Pelataan siis " + kysymyksia + " kierrosta.\n");

        for (TiedostoKysymys k : lista) {

            if (k.kysy()) {
                pisteet++;
            }

            kysytty++;

            if (kysytty == kysymyksia) {
                System.out.println("Sait " + pisteet + "/" + kysymyksia + " pistettä. Onnittelut!\n");
                break;
            }
        }
    }

    static private void lueTiedosto() {
        luettu = true;
        try (BufferedReader lukija = new BufferedReader(new FileReader(polku))) {
            // lue kaikki Kysymykset (rivit)
            for (String rivi = lukija.readLine(); rivi != null; rivi = lukija.readLine()) {
                // String array eri elementeistä riviltä
                String[] sanat = rivi.split(",");

                // oikea vastaus int
                int oikea = Integer.parseInt(sanat[4]);
                // lisää uusi TiedostoKysymys
                lista.add(new TiedostoKysymys(
                        sanat[0], sanat[1], sanat[2], sanat[3], oikea
                ));
            }
        } catch (FileNotFoundException e) {

            lueKysymyksetKasin();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void lueKysymyksetKasin() {

        rivit.add("Kuka on Academic Workin toimitusjohtaja?,Tommi Teräsvirta,Stefan Heinrichs,Jukka Pulkkinen,1");
        rivit.add("Kuka on Suomen ensimmainen presidentti?,Ståhlberg,Svinhufvud,Relander,0");
        rivit.add("Mita tarkoittaa %d?,String,Liukuluku,Kokonaisluku,2");
        rivit.add("Kannattaako tyhjaa catch -haaraa koodata?,Tottakai,Ilman muuta,Ei,2");
        rivit.add("Paljonko on 3+4*2?,14,11,12,1");
        rivit.add("Mika oli Koiviston presidenttikausi?,1972-1984,1982-1994,1986-1994,1");
        rivit.add("Kuka nayttelee MacGyveria?,Richard Dean Anderson,Chuck Norris,Dana Elcar,0");
        rivit.add("Mita tapahtuu 15.joulukuuta?,Suomen itsenäisyyspäivä,20 valmista IT-konsulttia valmistuu,Presidentin vaalit,1");
        rivit.add("Mika maa voitti Euroviisut vuonna 2014?,Itavalta,Ruotsi,Ukraina,0");
        rivit.add("Missa seuraavista tietorakenteideista hyodynnetaan FIFO -periaatetta?,Pino,Jono,Keko,1");
        rivit.add("Mikä on Javassa varattu avainsana?,Interface,int,True,0");
        rivit.add("Milloin Lansimetro valmistuu?,Lokakuussa,Marraskuussa,Ei se valmistu,0");
        rivit.add("Mita tieto lisaa?,Mammuttimaisia infra-jarjestelmia,Tyottomia kehittajia,tuskaa,2");
        rivit.add("String vai StringBuilder?,String,StringBuilder,Mikä on String?,1");
        rivit.add("Mika IDE?,IntelliJ Idea,NetBeans,Mika tuntuu parhaimmalta!,2");
        rivit.add("Onko Pluto planeetta?,Kylla!,Ei!,Talla on jotain tekemista sarjisten kanssa...,1");
        rivit.add("Ensimmainen koodari?,Ada Lovelace,James Gosling,Henry Ford,0");
        rivit.add("Poison of choice?,Coke,Pepsi,ES,0");
        rivit.add("Kuka oli Pinocchion isa?,Gepetto,Merlin,Giuseppe,0");
        rivit.add("Harry Potterin toinen nimi?,Julius,Jake,James,1");
        rivit.add("Christopher Paolinin kirjoittama kirjasarja?,Twilight,Terasrotta,Eragon,2");
        rivit.add("Mitka elaimet ovat yksi todennakoinen perusta lohikaarmeen legendalle?,Axolotl,dinosaurukset,Krokotiili,0");

        for (String rivi : rivit) {
            // String array eri elementeistä riviltä
            String[] sanat = rivi.split(",");

            // oikea vastaus int
            int oikea = Integer.parseInt(sanat[4]);
            // lisää uusi TiedostoKysymys
            lista.add(new TiedostoKysymys(
                    sanat[0], sanat[1], sanat[2], sanat[3], oikea
            ));
        }
    }

    private static void lisaaKysymys() {

        Scanner luku = new Scanner(System.in);

        System.out.println("Anna haluamasi kysymys:");
        String kysymys = luku.nextLine();

        System.out.println("Anna haluamasi ensimmäinen vastausvaihtoehto:");
        String vastaus1 = luku.nextLine();
        System.out.println("Anna haluamasi toinen vastausvaihtoehto:");
        String vastaus2 = luku.nextLine();
        System.out.println("Anna haluamasi kolmas vastausvaihtoehto:");
        String vastaus3 = luku.nextLine();

        String vastaus4 = null;

        for (;;) {

            System.out.println("Anna oikean vaihtoehdon indeksi (0, 1 tai 2):\n"
                    + "0 - " + vastaus1 + "\n"
                    + "1 - " + vastaus2 + "\n"
                    + "2 - " + vastaus3);

            vastaus4 = luku.nextLine();

            if (Integer.parseInt(vastaus4) == 0
                    || Integer.parseInt(vastaus4) == 1
                    || Integer.parseInt(vastaus4) == 2) {
                break;
            } else {
                continue;
            }

        }

        System.out.println("");

        List<String> apulista = new ArrayList<>();
        apulista.add(kysymys);
        apulista.add(vastaus1);
        apulista.add(vastaus2);
        apulista.add(vastaus3);
        apulista.add(vastaus4);

        String rivis = String.join(",", apulista);
        
        System.out.println("Lisätty rivi:\n" + rivis);

        try (FileWriter fw = new FileWriter(polku, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw)) {
            out.println("" + rivis);
        } catch (IOException e) {
            rivit.add(rivis);
        }

    }
}
