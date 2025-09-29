package Model;

public class LaguHipdut extends Model {
    private String tingkatAsik;

    public LaguHipdut(String judul, String artis, String genre, String tingkatAsik) {
        super(judul, artis, genre);
        this.tingkatAsik = tingkatAsik.isEmpty() ? "B aja" : tingkatAsik;
    }

    public String getTingkatAsik() { return tingkatAsik; }
    public void setTingkatAsik(String tingkatAsik) { this.tingkatAsik = tingkatAsik; }

    @Override
    public String deskripsiMusik() {
        return getJudul() + " - " + getArtis() + " [" + getGenre() + "] ~ Tingkat Asik: " + tingkatAsik;
    }
}
