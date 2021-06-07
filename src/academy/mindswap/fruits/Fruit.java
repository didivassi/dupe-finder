package academy.mindswap.fruits;

import java.util.Objects;

public abstract class Fruit implements Comparable<Fruit>  {
    //private FruitType fruitType;
    protected int acidityLevel;

    public Fruit(int acidityLevel) {
        this.acidityLevel=acidityLevel;
    }

    public int getAcidityLevel() {
        return acidityLevel;
    }

    public void setAcidityLevel(int acidityLevel) {
        this.acidityLevel = acidityLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        return acidityLevel == ((Fruit) o).acidityLevel;
    }

    @Override
    public int hashCode(){
        return Objects.hash(acidityLevel);
    }

    @Override
    public int compareTo(Fruit fruit) {
        /* For Ascending order*/
       // System.out.println(Class.class);
        return getClass().getName().compareTo(fruit.getClass().getName()) + this.acidityLevel-((Fruit)fruit).getAcidityLevel();

    }


}
