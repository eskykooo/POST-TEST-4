package Services;

import java.util.ArrayList;
import java.util.List;
import Model.*;

public class Services {
    private final List<Model> daftarMusik = new ArrayList<>();

    public void tambahMusik(Model musik) {
        daftarMusik.add(musik);
        System.out.println("Musik berhasil ditambahkan!");
    }

    public void tambahMusik(String judul, String artis, String genre) {
        daftarMusik.add(new LaguPop(judul, artis, genre, "Mood tidak diketahui"));
        System.out.println("Musik default (Pop) berhasil ditambahkan!");
    }

    public ArrayList<Model> getDaftarMusik() {
        return new ArrayList<>(daftarMusik);
    }

    public boolean ubahMusik(int index, Model musikBaru) {
        if (index >= 0 && index < daftarMusik.size()) {
            daftarMusik.set(index, musikBaru);
            return true;
        }
        return false;
    }

    public boolean hapusMusik(int index) {
        if (index >= 0 && index < daftarMusik.size()) {
            daftarMusik.remove(index);
            return true;
        }
        return false;
    }
}
