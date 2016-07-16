import pokedex.pokedex.Pokedex;

/**
 * Created by Georgy on 7/15/2016.
 */
public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.sortByName();
        pokedex.printPokemon();

    }
}
