import java.util.*;

//Minna, Kalle ja Katja Ryhmä "Kissalla on neljä jalkaa"
public class kysymys {

    public static void pelaa () {
        Scanner in = new Scanner(System.in);


        String kysymys = "Kuinka monta jalkaa kissalla on?";
        List<String> vastaukset = Arrays.asList("[0] neljä", "[1] viisi", "[2] kaksi");
        int oikeanVaihtoehdonIndeksi = 0;
        Kysymykset eka = new Kysymykset(kysymys, vastaukset, oikeanVaihtoehdonIndeksi);

        String kysymys2 = "Mikä on Saturnuksen suurin kuu?";
        List<String> vastaukset2 = Arrays.asList("[0] Atlas", "[1] Pandora", "[2] Titan");
        int oikeanVaihtoehdonIndeksi2 = 2;
        Kysymykset toka = new Kysymykset(kysymys2, vastaukset2, oikeanVaihtoehdonIndeksi2);

        String kysymys3 = "Kuka kehitti ns. yleisen suhteellisuusteorian?";
        List<String> vastaukset3 = Arrays.asList("[0] Svante Arrhenius", "[1] Albert Einstein", "[2] Friedrich Wilhelm Ostwald");
        int oikeanVaihtoehdonIndeksi3 = 1;
        Kysymykset kolmas = new Kysymykset(kysymys3, vastaukset3, oikeanVaihtoehdonIndeksi3);

        String kysymys4 = "Onko mansikka";
        List<String> vastaukset4 = Arrays.asList("[0] marja", "[1] hedelmä", "[2] epähedelmä");
        int oikeanVaihtoehdonIndeksi4 = 2;
        Kysymykset neljas = new Kysymykset(kysymys4, vastaukset4, oikeanVaihtoehdonIndeksi4);

        String kysymys5 = "Mikä on suomen suurin näätäeläin?";
        List<String> vastaukset5 = Arrays.asList("[0] mäyrä", "[1] supikoira", "[2] ahma");
        int oikeanVaihtoehdonIndeksi5 = 2;
        Kysymykset viides = new Kysymykset(kysymys5, vastaukset5, oikeanVaihtoehdonIndeksi5);

        String kysymys6 = "Missä päin Helsinkiä sijaitsee Vesala?";
        List<String> vastaukset6 = Arrays.asList("[0] lännessä", "[1] idässä", "[2] pohjoisessa");
        int oikeanVaihtoehdonIndeksi6 = 1;
        Kysymykset kuudes = new Kysymykset(kysymys6, vastaukset6, oikeanVaihtoehdonIndeksi6);


        List<Kysymykset> kysymyslista = new ArrayList<>();
        kysymyslista.add(eka);
        kysymyslista.add(toka);
        kysymyslista.add(kolmas);
        kysymyslista.add(neljas);
        kysymyslista.add(viides);
        kysymyslista.add(kuudes);
        int oikein = 0;
        int vaarin = 0;
        for (int i = 0; i < 6; i++) {

            int luku = 0;
            Collections.shuffle(kysymyslista);
            System.out.println(kysymyslista.get(0).getKysymysteksti());
            System.out.println("Vastausvaihtoehdot: ");
            System.out.println(kysymyslista.get(0).getVastausvaihtoehdot());
            kysymyslista.get(0).getOikeanVaihtoehdonIndeksi();
            System.out.print("Anna vastaus lukuna 0,1 tai 2: ");
            try {
                luku = in.nextInt();
            } catch (Exception e) {
                System.err.println("Ongelma lukemisessa: " + e.getMessage());
                System.err.println("Lopetetaan..");
                return;
            }
            if (luku == kysymyslista.get(0).getOikeanVaihtoehdonIndeksi()) {
                kysymyslista.remove(0);
                System.out.println("        Oikein!");
                oikein++;
            } else {
                System.out.println("        väärin");
                vaarin++;
                i--;

            }
            System.out.println("");
            System.out.println("-------------------");
            System.out.println("");
        }
        System.out.println("Oikeita vastauksia: " + oikein);
        System.out.println("Vääriä vastauksia: " + vaarin);
        System.out.println("");
        System.out.println("-------------------");
        System.out.println("");
        System.out.println("Ja näin");

        return;


    }


}




