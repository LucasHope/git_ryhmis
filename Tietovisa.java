import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tietovisa {

    static boolean luettu = false;
    private static final String polku = "src/harjoitukset/git_ryhmis/file/Tietovisakysymykset.txt";
    static List<Kysymys1> kysymysLista = new ArrayList<>();

    public static void pelaa() {

        luoKysymykset();

        kysymysLista = kysymysLista;

        Pelaa p = new Pelaa();
        p.pelinKulkuYhdella(kysymysLista);
//p.pelinkulkuKahdella(kysymysLista)
    }

    private static void luoKysymykset() {

        /*
        Kysymys1 k1 = new Kysymys1();
        k1.luoVastausvaihtoehdot("Kyllä", "Ei", "Ehkä");
        k1.luoKysymys("Onko hauki kala?", k1.vastausvaihtoehdot, 0);

        Kysymys1 k2 = new Kysymys1();
        k2.luoVastausvaihtoehdot("Ei", "Ehkä", "Kyllä");
        k2.luoKysymys("Onko ahven kala?", k2.vastausvaihtoehdot, 2);

        Kysymys1 k3 = new Kysymys1();
        k3.luoVastausvaihtoehdot("Yhdellä i:llä", "Kahdella i:llä", "Kolmella i:llä");
        k3.luoKysymys("Monella i-kirjaimellä S(x määrä i:tä)ri:n nimi kirjoitetaan?", k3.vastausvaihtoehdot, 1);

        Kysymys1 k4 = new Kysymys1();
        k4.luoVastausvaihtoehdot("10011 oppilasta", "10100 oppilasta", "21 oppilasta");
        k4.luoKysymys("Montako oppilasta Academyssa on?", k4.vastausvaihtoehdot, 1);

        Kysymys1 k5 = new Kysymys1();
        k5.luoVastausvaihtoehdot("Joooo!", "Tietenkin!", "Ehdottomasti :)");
        k5.luoKysymys("Onko tämä kivaa?", k5.vastausvaihtoehdot, 0);

        Kysymys1 k6 = new Kysymys1();
        k6.luoVastausvaihtoehdot("Ctrl + V", "Ctrl + C", "Ctrl + X");
        k6.luoKysymys("Mikä pikakomento käytetään tiedostojen kopioimiseen?", k6.vastausvaihtoehdot, 1);

        Kysymys1 k7 = new Kysymys1();
        k7.luoVastausvaihtoehdot("Ctrl + V", "Ctrl + C", "Ctrl + X");
        k7.luoKysymys("Mikä pikakomento käytetään tiedostojen liittämiseen?", k7.vastausvaihtoehdot, 0);

        Kysymys1 k8 = new Kysymys1();
        k8.luoVastausvaihtoehdot("Ctrl + V", "Ctrl + C", "Ctrl + X");
        k8.luoKysymys("Mikä pikakomento käytetään tiedostojen leikkaamiseen?", k8.vastausvaihtoehdot, 2);

        Kysymys1 k9 = new Kysymys1();
        k9.luoVastausvaihtoehdot("Pelkosenniemi", "Inari", "Utsjoki");
        k9.luoKysymys("Suomessa on yksi saamelaisenemmistöinen kunta, mikä?", k9.vastausvaihtoehdot, 2);

        Kysymys1 k10 = new Kysymys1();
        k10.luoVastausvaihtoehdot("Lappelainen puukko", "Lappelainen muki", "Poronheittäjien lasso");
        k10.luoKysymys("Mikä on leuku?", k10.vastausvaihtoehdot, 0);

        Kysymys1 k11 = new Kysymys1();
        k11.luoVastausvaihtoehdot("Yhdeksän", "Viisi", "Neljä");
        k11.luoKysymys("Montako aistia on kissalla?", k11.vastausvaihtoehdot, 1);

        Kysymys1 k12 = new Kysymys1();
        k12.luoVastausvaihtoehdot("Ei virallisesti", "On kuulunut vuodesta 1950", "On kuulunut vuodesta 1995");
        k12.luoKysymys("Kuuluuko Suomi Skandinaviaan?", k12.vastausvaihtoehdot, 0);

        Kysymys1 k13 = new Kysymys1();
        k13.luoVastausvaihtoehdot("Paistettua kalaa", "Keitettyä kalaa", "Kuivattua kalaa");
        k13.luoKysymys("Mitä on kapakala?", k13.vastausvaihtoehdot, 2);

        Kysymys1 k14 = new Kysymys1();
        k14.luoVastausvaihtoehdot("Mauste", "Rasvatonta maitoa", "Jotain muuta");
        k14.luoKysymys("Mitä on kurri?", k14.vastausvaihtoehdot, 1);

        Kysymys1 k15 = new Kysymys1();
        k15.luoVastausvaihtoehdot("Voitolta!", "Aivan mahtavalta :)", "Ei miltään");
        k15.luoKysymys("Miltä tuntui kun sai tietovisan toimimaan?", k15.vastausvaihtoehdot, 0);

        kysymysLista.add(k1);
        kysymysLista.add(k2);
        kysymysLista.add(k3);
        kysymysLista.add(k4);
        kysymysLista.add(k5);
        kysymysLista.add(k6);
        kysymysLista.add(k7);
        kysymysLista.add(k8);
        kysymysLista.add(k9);
        kysymysLista.add(k10);
        kysymysLista.add(k11);
        kysymysLista.add(k12);
        kysymysLista.add(k13);
        kysymysLista.add(k14);
        kysymysLista.add(k15); */

        if (!luettu) {
            lueTiedosto();
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
                Kysymys1 k = new Kysymys1();
                k.luoVastausvaihtoehdot(sanat[1], sanat[2], sanat[3]);
                k.luoKysymys(sanat[0], k.vastausvaihtoehdot, oikea);

                kysymysLista.add(k);
            }
        } catch (FileNotFoundException e) {

            lueKysymyksetKasin();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void lueKysymyksetKasin() {

        List<String> rivit = new ArrayList<>();
        
        rivit.add("Onko hauki kala?,Kylla,Ei,Ehka,0");
        rivit.add("Onko ahven kala?,Ei,Ehka,Kylla,2");
        rivit.add("Monella i-kirjaimellä S(x määrä i:tä)ri:n nimi kirjoitetaan?,1 i-kirjain,2 i-kirjainta,3 i-kirjainta,1");
        rivit.add("Montako oppilasta Academyssa on?,10011 oppilasta,10100 oppilasta,21 oppilasta,1");
        rivit.add("Onko tama kivaa?,Joooo!,Tietenkin!,Ehdottomasti :),0");
        rivit.add("Mika pikakomento kaytetaan tiedostojen kopioimiseen?,Ctrl+V,Ctrl+C,Ctrl+X,1");
        rivit.add("Mika pikakomento kaytetaan tiedostojen liittamiseen?,Ctrl+V,Ctrl+C,Ctrl+X,0");
        rivit.add("Mika pikakomento kaytetaan tiedostojen leikkaamiseen?,Ctrl+V,Ctrl+C,Ctrl+X,2");
        rivit.add("Mika on Suomen yksi saamelaisenemmistoinen kunta?,Pelkosenniemi,Inari,Utsjoki,2");
        rivit.add("Mika on leuku?,Lappelainen puukko,Lappelainen muki,Poronheittajien lasso,0");
        rivit.add("Montako aistia on kissalla?,Yhdeksan,Viisi,Nelja,1");
        rivit.add("Kuuluuko Suomi Skandinaviaan?,Ei virallisesti,On kuulunut vuodesta 1950,On kuulunut vuodesta 1995,0");
        rivit.add("Mita on kapakala?,Paistettua kalaa,Keitettya kalaa,Kuivattua kalaa,2");
        rivit.add("Milta tuntui kun sai tietovisan toimimaan?,Voitolta!,Aivan mahtavalta :),Ei miltaan,0");
        
        for (String rivi : rivit) {

            // String array eri elementeistä riviltä
                String[] sanat = rivi.split(",");

                // oikea vastaus int
                int oikea = Integer.parseInt(sanat[4]);
                // lisää uusi TiedostoKysymys
                Kysymys1 k = new Kysymys1();
                k.luoVastausvaihtoehdot(sanat[1], sanat[2], sanat[3]);
                k.luoKysymys(sanat[0], k.vastausvaihtoehdot, oikea);

                kysymysLista.add(k);
        }
    }

    public static class Pelaa {

        public void pelinKulkuYhdella(List<Kysymys1> kysymysLista) {

            Random rnd = new Random();
            int arvottavienLkm = 10;
            int pisteet = 0;

            for (int i = 0; i < arvottavienLkm; i++) {

                int index = rnd.nextInt(kysymysLista.size());

                System.out.println(i + 1 + ". " + kysymysLista.get(index));
                System.out.println("Anna Vastauksesi: ");
                try {
                    Scanner lukija = new Scanner(System.in);
                    String vastaus = lukija.nextLine();
                    if (vastaus.trim().equals("")) {
                        System.out.println("Väärä vastaus :( Oikea vastaus olisi ollut: " + kysymysLista.get(index).oikeanVaihtoehdonIndeksi + ")");
                        System.out.println("Pisteesi: " + pisteet);
                        System.out.println("--------------------------------------------");
                        System.out.println("  ");
                        continue;
                    }
                    int v = Integer.parseInt(vastaus);
                    if (v == (kysymysLista.get(index).oikeanVaihtoehdonIndeksi)) {
                        System.out.println("HYVIN MENI!");
                        pisteet++;
                        System.out.println("Pisteesi: " + pisteet);
                        System.out.println("--------------------------------------------");
                        System.out.println("  ");
                    } else {
                        System.out.println("Väärä vastaus :( Oikea vastaus olisi ollut: " + kysymysLista.get(index).oikeanVaihtoehdonIndeksi + ")");
                        System.out.println("Pisteesi: " + pisteet);
                        System.out.println("--------------------------------------------");
                        System.out.println("  ");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                kysymysLista.remove(index);

            }

            System.out.println("Peli loppui, sait " + pisteet + " pistettä!");
        }

    }

    public void pelinKulkuKahdella(List<Kysymys1> kysymysLista) {
        Kysymys1 k = new Kysymys1();

        kysymysLista = kysymysLista;

        Random rnd = new Random();
        int arvottavienLkm = 10;
        int pisteetPel1 = 0;
        int pisteetPel2 = 0;
        String pelaaja1 = null;
        String pelaaja2 = null;
        Scanner lukija = new Scanner(System.in);

        System.out.println("Anna pelaajatunnuksesi pelaaja 1: ");
        pelaaja1 = lukija.nextLine();
        System.out.println("Anna pelaajatunnuksesi pelaaja 2: ");
        pelaaja2 = lukija.nextLine();

        for (int i = 0; i < arvottavienLkm; i++) {

            int index = rnd.nextInt(kysymysLista.size());

            System.out.println("---------------------------------------------");
            System.out.println(i + 1 + ". " + kysymysLista.get(index));
            System.out.println("Anna vastauksesi " + pelaaja1 + ": ");
            try {
                String vastaus1 = lukija.nextLine();
                if (vastaus1.trim().equals("")) {
                    i--;
                    continue;
                }
                int v1 = Integer.parseInt(vastaus1);
                if (v1 == (kysymysLista.get(index).oikeanVaihtoehdonIndeksi)) {
                    pisteetPel1++;

                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Anna vastauksesi " + pelaaja2 + ": ");
            try {
                String vastaus2 = lukija.nextLine();
                if (vastaus2.trim().equals("")) {
                    i--;
                    if (pisteetPel1 > 0) {
                        pisteetPel1--;
                    }
                    System.out.println("  ");
                    System.out.println("Oikea vastaus oli: " + kysymysLista.get(index).oikeanVaihtoehdonIndeksi + ")");
                    System.out.println("  ");
                    System.out.println("Pistetilanne:");
                    System.out.println(pelaaja1 + ": " + pisteetPel1 + " pistettä.");
                    System.out.println(pelaaja2 + ": " + pisteetPel2 + " pistettä.");
                    System.out.println("  ");
                    continue;
                }
                int v2 = Integer.parseInt(vastaus2);
                if (v2 == (kysymysLista.get(index).oikeanVaihtoehdonIndeksi)) {
                    pisteetPel2++;
                }

                System.out.println("  ");
                System.out.println("Oikea vastaus oli: " + kysymysLista.get(index).oikeanVaihtoehdonIndeksi + ")");
                System.out.println("  ");
                System.out.println("Pistetilanne:");
                System.out.println(pelaaja1 + ": " + pisteetPel1 + " pistettä.");
                System.out.println(pelaaja2 + ": " + pisteetPel2 + " pistettä.");
                System.out.println("  ");

            } catch (Exception e) {
                e.printStackTrace();
            }

            kysymysLista.remove(index);

        }

        System.out.println("---------------------------------------------");
        System.out.println("Peli loppui");
        System.out.println(pelaaja1 + " sai " + pisteetPel1 + " pistettä!");
        System.out.println(pelaaja2 + " sai " + pisteetPel2 + " pistettä!");
        if (pisteetPel1 != pisteetPel2) {
            System.out.println(pisteetPel1 > pisteetPel2 ? "Onneksi olkoon " + pelaaja1 + ", sinä voitit!" : "Onneksi olkoon " + pelaaja2 + ", sinä voitit!");
        } else {
            System.out.println("Tasapeli! :)");
        }
    }
}
