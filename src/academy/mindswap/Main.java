package academy.mindswap;

import academy.mindswap.fruits.Apple;
import academy.mindswap.fruits.Fruit;
import academy.mindswap.fruits.Orange;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here



        ArrayList<Fruit> list =new ArrayList<>();
        list.add(new Apple(1));
        list.add(new Apple(2));
        list.add(new Apple(2));//1
        list.add(new Apple(1));//2
        list.add(new Apple(1));//3
        list.add(new Apple(3));
        list.add(new Orange(1));
        list.add(new Orange(2));
        list.add(new Orange(2));//4
        list.add(new Orange(1));//5
        list.add(new Orange(3));

        DupeFinder<Fruit>  dupeFinder= new DupeFinder<>(list);

        System.out.println("Number of elements in list "+dupeFinder.countList());
        System.out.println("Number of duplicated elements in list " + dupeFinder.countDuplicates());

        List<Fruit> duplicatedList= dupeFinder.getDuplicatedList();
        for (Fruit fruit:duplicatedList) {
            System.out.println(fruit);
        }
        System.out.println("-------");
        Collections.sort(duplicatedList);
        for (Fruit fruit:duplicatedList) {
            System.out.println(fruit);
        }




       // dupeFinder.showDuplicates();

       // dupeFinder.showWithoutDuplicates();
    }
}
