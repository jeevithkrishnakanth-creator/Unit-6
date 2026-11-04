public class Shelter {
    public static void main(String[] args) {
        Dog millie = new Dog();
        millie.setName("Millie");
        millie.setAge(3);
        millie.setBreed("beagle");

        System.out.println("Name: " + millie.getName());
        System.out.println("Age: " + millie.getAge());
        System.out.println("Breed: " + millie.getBreed());
        System.out.println("You should adopt " + millie.getName() + "!");
    }
}
