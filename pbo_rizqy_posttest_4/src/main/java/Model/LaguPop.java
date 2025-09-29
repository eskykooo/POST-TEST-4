package Model;

public class LaguPop extends Model {
    private String mood;

    public LaguPop(String judul, String artis, String genre, String mood) {
        super(judul, artis, genre);
        this.mood = mood.isEmpty() ? "Mood tidak diketahui" : mood;
    }

    public String getMood() { return mood; }
    public void setMood(String mood) { this.mood = mood; }

    @Override
    public String deskripsiMusik() {
        return getJudul() + " - " + getArtis() + " [" + getGenre() + "] ~ Mood: " + mood;
    }
}
