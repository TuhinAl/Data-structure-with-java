package list;

import java.util.*;

/**
 * @author Alauddin Tuhin
 * @Project java-data-structure
 * @CreatedAt 6/1/21 on 7:42 AM
 */
public class ArrayListTestClass {



    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        ArrayList<String> arrayList = new ArrayList<>();


        list.add("real madrid");
        list.add("barcelona");
        list.add("sevilla");
       // list.add(null);
        list.add("liverpool");
        list.add("chelsea");
        list.add("man city");
       // list.add(null);
        list.add("manchester united");
        list.add("arsenal");
        list.add(3,"west ham");
        System.out.println("normal list: " + list);

        Collections.sort(list);
        for (String s : list) {
            System.out.println("sorted s: " + s);
        }
        System.out.println("List sort: ");
        System.out.println("List sort: ");
        System.out.println("List sort: ");
        System.out.println("List sort: ");



        System.out.println("normal list: " + list.get(4));
        System.out.println("list size: "+list.size());
        Object [] listToArray = list.toArray();
        list.clear();
        System.out.println("normal list: " + list);
        System.out.println("is contains Arsenal? " + list.contains("Arsenal"));
      //  System.out.println("is contains Arsenal? " + list.get(0).equalsIgnoreCase("real madrid"));
        System.out.println("array: " +listToArray);


        ArrayList<Object> emptyList = new ArrayList<>();

        emptyList.add("first value");
        System.out.println("empty list initial size: "+emptyList.size());
        emptyList.ensureCapacity(3);
        emptyList.add("second value");
        emptyList.add("third value");
        emptyList.add("third value");
        emptyList.add("third value");
        emptyList.add("fourth value");
        System.out.println("empty list final size: "+emptyList.size());
        //System.out.println("list iterate : "+list.);

        ListIterator<String> listIterator = list.listIterator();
        //ListIterator<String> listIteratorFromIndex = list.listIterator(3);

        while (listIterator.hasNext()) {
            System.out.println("iterator: "+listIterator.next());
        }

       /* while (listIteratorFromIndex.hasNext()) {
            System.out.println("iterator: "+listIteratorFromIndex.next());
        }*/

        /*for (Object s : listToArray) {
            System.out.println("array value "+s);
        }*/


    }


}
