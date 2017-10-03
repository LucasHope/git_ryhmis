<<<<<<< HEAD

import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Tietovisa {

<<<<<<< HEAD
    public static void pelaa () {

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

        Kysymys1 k = new Kysymys1();
=======
   
        k.kysymysLista.add(k1);
        k.kysymysLista.add(k2);
        k.kysymysLista.add(k3);
        k.kysymysLista.add(k4);
        k.kysymysLista.add(k5);
        k.kysymysLista.add(k6);
        k.kysymysLista.add(k7);
        k.kysymysLista.add(k8);
        k.kysymysLista.add(k9);
        k.kysymysLista.add(k10);
        k.kysymysLista.add(k11);
        k.kysymysLista.add(k12);
        k.kysymysLista.add(k13);
        k.kysymysLista.add(k14);
        k.kysymysLista.add(k15);


        Pelaa p = new Pelaa();
        p.pelinKulkuYhdella(k.kysymysLista);
//p.pelinkulkuKahdella(k.kysymysLista)
    }

    public static class Pelaa {

<<<<<<< HEAD
        public void pelinKulkuYhdella(List<Kysymys1> kysymysLista) {
            Kysymys1 k = new Kysymys1();
            k.kysymysLista = kysymysLista;


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




<<<<<<< HEAD
    public void pelinKulkuKahdella (List <Kysymys1> kysymysLista) {
            Kysymys1 k = new Kysymys1();

            k.kysymysLista = kysymysLista;

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

