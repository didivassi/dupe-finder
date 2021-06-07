package academy.mindswap;

import academy.mindswap.fruits.Fruit;

import java.util.*;

public class DupeFinder<E> {

    List<E> list;
    public DupeFinder(List<E> list){
        this.list=list;
    }

    public int countList(){
        return list.size();
    }

    public int countDuplicates(){
        Set<E> set=new HashSet<>(list);
       // set.addAll(list);
        return list.size()-set.size();
    }


    public List<E> getDuplicatedList() {
        Set<E> set=new HashSet<>(list);
        List<E> listDup=new ArrayList<E>(list);
        for (E element:set) {
            if(listDup.contains(element)){
                listDup.remove(element);
            }
        }

        return listDup;
    }

    public List<E>  getNonDuplicatedList(){
        return new ArrayList<E>(new HashSet<E>(list));
    }




}
