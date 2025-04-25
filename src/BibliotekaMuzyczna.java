import java.util.ArrayList;

public class BibliotekaMuzyczna {
    private String nazwa;
    private String wlasciciel;
    public ArrayList<String> utwory;
    private ArrayList<Playlista> playlisty;

    public BibliotekaMuzyczna(String nazwa, String wlasciciel) {
        this.nazwa = nazwa;
        this.wlasciciel = wlasciciel;
        this.utwory = new ArrayList<>();
        this.playlisty = new ArrayList<>();
    }

    public void dodajUtwor(String utwor) {
        if (!utwory.contains(utwor)) {
            utwory.add(utwor);
        }
    }

    public void usunUtwor(String utwor) {
        utwory.remove(utwor);
        for (Playlista p : playlisty) {
            p.usunUtwor(utwor);
        }
    }

    public void wyswietlUtwory() {
        System.out.println("🎵 Utwory w bibliotece:");
        for (String utwor : utwory) {
            System.out.println(" - " + utwor);
        }
    }

    public void wyszukajUtwory(String fraza) {
        System.out.println("🔍 Wyszukiwanie: " + fraza);
        for (String utwor : utwory) {
            if (utwor.toLowerCase().contains(fraza.toLowerCase())) {
                System.out.println(" - " + utwor);
            }
        }
    }

    public void utworzPlayliste(String nazwaPlaylisty) {
        if (znajdzPlayliste(nazwaPlaylisty) == null) {
            playlisty.add(new Playlista(nazwaPlaylisty));
        }
    }

    public Playlista znajdzPlayliste(String nazwaPlaylisty) {
        for (Playlista p : playlisty) {
            if (p.getNazwa().equalsIgnoreCase(nazwaPlaylisty)) {
                return p;
            }
        }
        return null;
    }

    public void dodajUtworDoPlaylisty(String utwor, String nazwaPlaylisty) {
        Playlista p = znajdzPlayliste(nazwaPlaylisty);
        if (p != null && utwory.contains(utwor)) {
            p.dodajUtwor(utwor);
        }
    }

    public void wyswietlPlayliste(String nazwaPlaylisty) {
        Playlista p = znajdzPlayliste(nazwaPlaylisty);
        if (p != null) {
            p.wyswietl();
        } else {
            System.out.println("❗ Brak playlisty: " + nazwaPlaylisty);
        }
    }

    public void wyswietlWszystkiePlaylisty() {
        System.out.println("📁 Wszystkie playlisty:");
        for (Playlista p : playlisty) {
            System.out.println(" - " + p.getNazwa());
        }
    }

    public int getLiczbaUtworow() {
        return utwory.size();
    }

    public int getLiczbaPlaylist() {
        return playlisty.size();
    }
}
