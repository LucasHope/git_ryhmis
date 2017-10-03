import java.util.ArrayList;
import java.util.List;

public class Kysymys1 {


    String kysymysteksti;
    List<String> vastausvaihtoehdot = new ArrayList<>();
    int oikeanVaihtoehdonIndeksi;
    List<Kysymys1> kysymysLista = new ArrayList<>();

    public Kysymys1() {

    }


    public void luoKysymys(String kysymysteksti, List<String> vastausvaihtoehdot, int oikeanVaihtoehdonIndeksi) {
        this.kysymysteksti = kysymysteksti;
        this.vastausvaihtoehdot = vastausvaihtoehdot;
        this.oikeanVaihtoehdonIndeksi = oikeanVaihtoehdonIndeksi;

    }

    public void luoVastausvaihtoehdot(String a, String b, String c){
        vastausvaihtoehdot.add(a);
        vastausvaihtoehdot.add(b);
        vastausvaihtoehdot.add(c);
    }

    @Override
    public String toString() {
        return kysymysteksti + '\n'  +
                "0)" + vastausvaihtoehdot.get(0) + '\n' +
                "1)" + vastausvaihtoehdot.get(1) + '\n' +
                "2)" + vastausvaihtoehdot.get(2) + '\n';
    }
}
