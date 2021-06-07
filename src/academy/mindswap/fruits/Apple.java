package academy.mindswap.fruits;

public class Apple extends Fruit{

    public Apple(int acidityLevel) {
        super( acidityLevel);
    }
    @Override
    public String toString(){
        return  "Apple " + acidityLevel;
    }
}
