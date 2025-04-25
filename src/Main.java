//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
 {
            BibliotekaMuzyczna mojaBiblioteka = new BibliotekaMuzyczna("Playlisty taszy", "tasza");

            // Dodawanie utworów
            mojaBiblioteka.dodajUtwor("Frédéric Chopin, Peter Jablonski - Waltz No. 19 in A minor, Op. posth.");
            mojaBiblioteka.dodajUtwor("Johann Sebastian Bach, Nico Van Der Meel - St. Matthew Passion, BWV 244: Pt. I: No. 1");
            mojaBiblioteka.dodajUtwor("Pyotr Ilyich Tchaikovsky, Nora Mercz - Valse sentimentale, Op. 51 No. 6");
            mojaBiblioteka.dodajUtwor("Antonín Dvořák, Peter Breiner - Slavonic Dances, Op. 72: No. 2 in E Minor");
            mojaBiblioteka.dodajUtwor("Alexander Scriabin, Maria Lettberg - 2 Pieces for the Left Hand, Op. 9: No. 1");
            mojaBiblioteka.dodajUtwor("Bedřich Smetana, Jitka Čechová - 6 Album Leaves, Op. 2: No. 2 in A Minor");
            mojaBiblioteka.dodajUtwor("Alexander Scriabin, Evgeny Zarafiants - Prelude No. 4 in E-Flat Minor, Op. 16");
            mojaBiblioteka.dodajUtwor("Frédéric Chopin, Khatia Buniatishvili - Ballade No. 4 in F Minor, Op. 52");
            mojaBiblioteka.dodajUtwor("Robert Schumann, Boris Giltburg - Carnaval, Op. 9: No. 12. Chopin");
            mojaBiblioteka.dodajUtwor("Frédéric Chopin, Jan Lisiecki - Nocturne in C Sharp Minor, KK IVa/16");
            mojaBiblioteka.dodajUtwor("Atlantic Five Jazz Band - Autumn Leaves");
            mojaBiblioteka.dodajUtwor("Charles Bosley - Autumn Leaves");
            mojaBiblioteka.dodajUtwor("Frédéric Chopin, Alice Sara Ott - Waltz No. 3 in A Minor, Op. 34 No. 2");
            mojaBiblioteka.dodajUtwor("Bedřich Smetana, Miroslav Sekera - Bagatelles and Impromptus: Innocence");
            mojaBiblioteka.dodajUtwor("Camille Saint-Saëns, Yo-Yo Ma, Kathryn Stott - Carnival of the Animals: XIII. The Swan");
            mojaBiblioteka.dodajUtwor("Ólafur Arnalds, Alice Sara Ott - Reminiscence");
            mojaBiblioteka.dodajUtwor("Ólafur Arnalds, Alice Sara Ott - Eyes Shut - Nocturne in C Minor");

            // Playlisty
            mojaBiblioteka.utworzPlayliste("Chopin & Friends");
            mojaBiblioteka.utworzPlayliste("Melancholia wieczorna");
            mojaBiblioteka.utworzPlayliste("Słowiańska dusza");
            mojaBiblioteka.utworzPlayliste("Bach i Barok");

            // Chopin & Friends
            mojaBiblioteka.dodajUtworDoPlaylisty("Frédéric Chopin, Peter Jablonski - Waltz No. 19 in A minor, Op. posth.", "Chopin & Friends");
            mojaBiblioteka.dodajUtworDoPlaylisty("Frédéric Chopin, Jan Lisiecki - Nocturne in C Sharp Minor, KK IVa/16", "Chopin & Friends");
            mojaBiblioteka.dodajUtworDoPlaylisty("Frédéric Chopin, Alice Sara Ott - Waltz No. 3 in A Minor, Op. 34 No. 2", "Chopin & Friends");
            mojaBiblioteka.dodajUtworDoPlaylisty("Frédéric Chopin, Khatia Buniatishvili - Ballade No. 4 in F Minor, Op. 52", "Chopin & Friends");

            // Melancholia wieczorna
            mojaBiblioteka.dodajUtworDoPlaylisty("Atlantic Five Jazz Band - Autumn Leaves", "Melancholia wieczorna");
            mojaBiblioteka.dodajUtworDoPlaylisty("Charles Bosley - Autumn Leaves", "Melancholia wieczorna");
            mojaBiblioteka.dodajUtworDoPlaylisty("Ólafur Arnalds, Alice Sara Ott - Reminiscence", "Melancholia wieczorna");
            mojaBiblioteka.dodajUtworDoPlaylisty("Ólafur Arnalds, Alice Sara Ott - Eyes Shut - Nocturne in C Minor", "Melancholia wieczorna");

            // Słowiańska dusza
            mojaBiblioteka.dodajUtworDoPlaylisty("Antonín Dvořák, Peter Breiner - Slavonic Dances, Op. 72: No. 2 in E Minor", "Słowiańska dusza");
            mojaBiblioteka.dodajUtworDoPlaylisty("Bedřich Smetana, Jitka Čechová - 6 Album Leaves, Op. 2: No. 2 in A Minor", "Słowiańska dusza");
            mojaBiblioteka.dodajUtworDoPlaylisty("Bedřich Smetana, Miroslav Sekera - Bagatelles and Impromptus: Innocence", "Słowiańska dusza");

            // Bach i Barok
            mojaBiblioteka.dodajUtworDoPlaylisty("Johann Sebastian Bach, Nico Van Der Meel - St. Matthew Passion, BWV 244: Pt. I: No. 1", "Bach i Barok");

            // Wyświetlenia
            mojaBiblioteka.wyswietlUtwory();
            mojaBiblioteka.wyswietlWszystkiePlaylisty();
            mojaBiblioteka.wyswietlPlayliste("Chopin & Friends");
            mojaBiblioteka.wyswietlPlayliste("Melancholia wieczorna");

            System.out.println("📊 Łączna liczba utworów: " + mojaBiblioteka.getLiczbaUtworow());
            System.out.println("📊 Łączna liczba playlist: " + mojaBiblioteka.getLiczbaPlaylist());
        }
        }
    }
