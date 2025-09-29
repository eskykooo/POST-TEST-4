package Model;

public class LaguRock extends Model {
    private String tipeRock;

    public LaguRock(String judul, String artis, String genre, String tipeRock) {
        super(judul, artis, genre);
        this.tipeRock = tipeRock.isEmpty() ? "Soft Rock" : tipeRock;
    }

    public String getTipeRock() { return tipeRock; }
    public void setTipeRock(String tipeRock) { this.tipeRock = tipeRock; }

    @Override
    public String deskripsiMusik() {
        return getJudul() + " - " + getArtis() + " [" + getGenre() + "] ~ Tipe Rock: " + tipeRock;
    }
}
