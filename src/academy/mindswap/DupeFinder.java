package academy.mindswap;

import academy.mindswap.fruits.Fruit;

import java.util.*;

public class DupeFinder<E> {

    Collection<E> list;
    public DupeFinder(Collection<E> list){
        this.list=list;
    }

    public int countList(){
        return list.size();
    }

    public int countDuplicates(){
        Set<E> set=new HashSet<>(list);
        return list.size()-set.size();
    }

   /**
   * Returns a new ArrayList containing only duplicated elements
   *
   * */
    public List<E> getDuplicatedList() {
        Set<E> set=new HashSet<>(list);
        List<E> listDup=new ArrayList<E>(list);
        for (E element:set) {
          //  if(listDup.contains(element)){
                listDup.remove(element);
          //  }
        }
        return listDup;
    }

    /**
     * Returns a new ArrayList without duplicated elements
     *
     * */
    public List<E>  getNonDuplicatedList(){
        return new ArrayList<E>(new HashSet<E>(list));
    }

}
