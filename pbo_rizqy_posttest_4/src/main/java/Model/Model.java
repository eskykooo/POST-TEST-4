package Model;

public abstract class Model {
    private String judul;
    private String artis;
    private String genre;

    public Model(String judul, String artis, String genre) {
        this.judul = judul.isEmpty() ? "Tidak diketahui" : judul;
        this.artis = artis.isEmpty() ? "Tidak diketahui" : artis;
        this.genre = genre.isEmpty() ? "Tidak diketahui" : genre;
    }

    public String getJudul() { return judul; }
    public void setJudul(String judul) { this.judul = judul; }

    public String getArtis() { return artis; }
    public void setArtis(String artis) { this.artis = artis; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public abstract String deskripsiMusik();
}
