package academy.mindswap.fruits;

public class Orange extends Fruit{

    public Orange(int acidityLevel) {
        super(acidityLevel);
    }

    @Override
    public String toString(){
        return  "Orange " + acidityLevel;
    }
}
