package pokemon.pokedex;

import java.util.Comparator;

/**
 * Created by Georgy on 7/15/2016.
 */
public class Pokemon implements Comparator<Pokemon>, Comparable<Pokemon> {
    private String name;
    private String type;
    private int cp;

    public Pokemon(){

    }

    @Override
    public String toString() {
        return "Pokemon " +
                "'name=" + name + '\'' +
                " type='" + type + '\'' +
                " cp=" + cp;
    }

    public Pokemon(String name, String type, int cp) {
        this.name = name;
        this.type = type;
        this.cp = cp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    @Override
    public int compareTo(Pokemon o) {
        return (this.name).compareTo(o.name);
    }

    @Override
    public int compare(Pokemon o1, Pokemon o2) {
        return o2.cp - o1.cp;
    }



}
