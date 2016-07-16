package pokedex.pokedex;

import pokemon.pokedex.Pokemon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Pokedex {
    private Pokemon raticate = new Pokemon("Raticate","normal", 301);
    private Pokemon pidgeot = new Pokemon("Pidgeot", "normal/flying", 222);
    private Pokemon fearow = new Pokemon("Fearow", "normal/flying", 219);
    private Pokemon paras = new Pokemon("Paras", "bug/grass", 172);
    private StringBuilder builder = new StringBuilder();
    public Pokedex(){
        myPokemons();
    }

    private List<Pokemon> pokedex = new ArrayList<>();


    public void addPokemon(Pokemon pokemon){
        pokedex.add(pokemon);
    }

    public List<Pokemon> listPokemon(){
        return pokedex;
    }
    public void printPokemon(){
        Iterator<Pokemon> iterator = pokedex.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    private void myPokemons(){
        pokedex.add(pidgeot);
        pokedex.add(fearow);
        pokedex.add(raticate);
        pokedex.add(paras);
    }

    public void sortByCp(){
        Collections.sort(pokedex, new Pokemon());
    }
    public void sortByName(){
        Collections.sort(pokedex);
    }


    }






