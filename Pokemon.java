public class Pokemon {
    String species;
    String type;
    int maxHealth;
    int health;
    int attack;
    int knockouts = 0;

    Pokemon(String species, String type, int maxHealth, int attack) {
        this.species = species;
        this.type = type;
        this.maxHealth = maxHealth;
        this.health = maxHealth;
        this.attack = attack;
    }

    void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        System.out.println(species + " took " + damage + " damage!");
        showHealth();
    }

    void heal(int heal) {
        health += heal;
        if (health > maxHealth) {
            health = maxHealth;
        }
        System.out.println(species + " gained " + heal + "health!");
        showHealth();
    }

    void showHealth() {
        if (consciousness()) {
            System.out.println(species + " has " + health + " health left!");
        } else {
            System.out.println(species + " is unconscious!");
            knockouts++;
        }
    }

    boolean consciousness() {
        if (health == 0) {
            return false;
        } else {
            return true;
        }
    }

    boolean consciousness(Pokemon pokemon) {
        if (pokemon.health == 0) {
            return false;
        } else {
            return true;
        }
    }

    boolean friends(Pokemon pokemon) {
        if (this.type == pokemon.type) {
            return true;
        } else {
            return false;
        }
    }

    void interact(Pokemon pokemon) {
        if (consciousness()) {
            if (friends(pokemon)) {
                if (!consciousness(pokemon)) {
                    System.out.println(species + " heals " + pokemon.species + "!");
                    pokemon.heal(maxHealth / 4);
                }
            } else {
                if (consciousness(pokemon)) {
                    System.out.println(species + " attacks " + pokemon.species);
                    pokemon.takeDamage(attack);
                    takeDamage(pokemon.attack / 2);
                }
            }
        }
    }

    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", "Electric", 35, 28);
        Pokemon charizard = new Pokemon("Charizard", "Fire", 78, 42);
        Pokemon squirtle = new Pokemon("Squirtle", "Water", 44, 25);
        Pokemon charmander = new Pokemon("Charmander", "Fire", 38, 26);

        charmander.interact(pikachu);
        squirtle.interact(charmander);
        charizard.interact(squirtle);
        pikachu.interact(squirtle);
        charizard.interact(charmander);
        charmander.interact(charizard);
        pikachu.interact(charmander);
        System.out.println("Total knockouts:"
                + (pikachu.knockouts + charizard.knockouts + squirtle.knockouts + charmander.knockouts));
    }
}