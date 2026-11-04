public class Artwork {
    String name;
    String artist;
    int year;

    Artwork(String name, String artist, int year) {
        this.name = name;
        this.artist = artist;
        this.year = year;
    }

    public static void main(String[] args) {
        Artwork Mona_Lisa = new Artwork("Mona Lisa", "Leonardo Da Vinci", 1503);
        Artwork The_Raft_of_the_Medusa = new Artwork("The Raft of the Medusa", "Théodore Géricault", 1818);
        System.out.println("The painting " + The_Raft_of_the_Medusa.name + " was created by "
                + The_Raft_of_the_Medusa.artist + " in " + The_Raft_of_the_Medusa.year + ".");
    }
}
