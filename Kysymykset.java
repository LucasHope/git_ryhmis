import java.util.List;

public class Kysymykset {
    String kysymysteksti;
    List<String> vastausvaihtoehdot;
    int oikeanVaihtoehdonIndeksi;

    public Kysymykset(String kysymysteksti, List<String> vastausvaihtoehdot, int oikeanVaihtoehdonIndeksi) {
        this.kysymysteksti = kysymysteksti;
        this.vastausvaihtoehdot = vastausvaihtoehdot;
        this.oikeanVaihtoehdonIndeksi = oikeanVaihtoehdonIndeksi ;
    }



    public String getKysymysteksti() {
        return kysymysteksti;
    }

    public void setKysymysteksti(String kysymysteksti) {
        this.kysymysteksti = kysymysteksti;
    }

    public List<String> getVastausvaihtoehdot() {
        return vastausvaihtoehdot;
    }

    public void setVastausvaihtoehdot(List<String> vastausvaihtoehdot) {
        this.vastausvaihtoehdot = vastausvaihtoehdot;
    }

    public int getOikeanVaihtoehdonIndeksi() {
        return oikeanVaihtoehdonIndeksi;
    }

    public void setOikeanVaihtoehdonIndeksi() {
        this.oikeanVaihtoehdonIndeksi = oikeanVaihtoehdonIndeksi;

    }

    @Override
    public String toString() {
        return "Kysymykset{" +
                "kysymysteksti='" + kysymysteksti + '\'' +
                ", vastausvaihtoehdot=" + vastausvaihtoehdot +
                ", oikeanVaihtoehdonIndeksi=" + oikeanVaihtoehdonIndeksi +
                '}';
    }
}
