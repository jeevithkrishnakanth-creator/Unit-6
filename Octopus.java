public class Octopus {
    int tentacles = 8;

    public static void main(String[] args) {
        Octopus octopus = new Octopus();
        System.out.println("The octopus has " + octopus.tentacles + " tentacles.");
        octopus.tentacles -= 2;
        System.out.println("The octopus now has " + octopus.tentacles + " tentacles.");
    }
}
