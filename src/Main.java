public class Main {

    public static void main(String[] args) {

        System.out.println("=== Movie Ticket Reservation System ===\n");

        Film f1 = new Film("Avatar");
        Film f2 = new Film("Titanic");
        Viewer v = new Viewer("Ali");
        Cinema c = new Cinema("Chaplin");

        System.out.println("Created classes: Film, Viewer, Cinema -> DONE");
        System.out.println("Film 1 title: " + f1.getTitle());
        System.out.println("Film 2 title: " + f2.getTitle());

        System.out.println("Viewer name: " + v.getName());
        System.out.println("Cinema name: " + c.getName());

        System.out.println("Object comparison (films): " +
                (f1.getTitle().equals(f2.getTitle())
                        ? "Same films"
                        : "Different films"));
    }
}

class Film {
    private String title;

    public Film(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Viewer {
    private String name;

    public Viewer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Cinema {
    private String name;

    public Cinema(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
