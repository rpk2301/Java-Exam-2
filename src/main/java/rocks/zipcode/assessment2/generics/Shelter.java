package rocks.zipcode.assessment2.generics;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Shelter is a generic class that holds Objects that extends `Ageable`.
 * For example, if a Person and a Dog extends Ageable, then I can declare the following:
 * <p>
 * Shelter<Person> farmHouse = new Shelter<Person>();
 * Shelter<Dog> dogHouse = new Shelter<Dog>();
 */
public class Shelter<_> implements Iterable {
   public ArrayList<Object> shelt;

    public Shelter() {

        this.shelt = new ArrayList<Object>();
    }

    /**
     * @return the number of item in the shelter
     */
    public int size() {
        return shelt.size();
    }

    public void add(Object object) {
        shelt.add(object);
    }

    public Boolean contains(Object object) {
        return shelt.contains(object);
    }

    public void remove(Object object) {
        shelt.remove(object);
    }

    public Object get(Integer index) {
        return shelt.get(index);
    }

    public Integer getIndexOf(Object ageable) {

        return shelt.indexOf(ageable);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}