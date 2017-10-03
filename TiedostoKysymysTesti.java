package harjoitukset.git_ryhmis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TiedostoKysymysTesti {

    static boolean luettu = false;
    static List<TiedostoKysymys> lista = new ArrayList<>();
    private static final String polku = "src/harjoitukset/git_ryhmis/file/kysymykset.txt";

    public static void pelaa() {

        if (!luettu) {
            lueTiedosto();
        }

        Collections.shuffle(lista);

        int pisteet = 0;
        int kysytty = 0;

        int kysymyksia;

        Scanner lue = new Scanner(System.in);

        System.out.println("Montako kierrosta haluat pelata? (max " + lista.size() + " kierrosta!)");
        kysymyksia = Integer.parseInt(lue.nextLine());

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

        List<String> rivit = new ArrayList<>();
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
}
