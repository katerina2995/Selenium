package lesson8;

import java.util.*;

public class CollectionEx {
    public static void main(String[] args) {
        int[] arr = new int[10];
        String[] strings = new String[10];
        for (String string : strings) {
//            System.out.print(i + " ");
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }


        //=============Collections==========
        //List
        List<Integer> linkedList = new LinkedList<>();


        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(21);
        linkedList.remove(0);
        linkedList.add(0, 100);

        for (Integer integer : linkedList) {
            System.out.println("Linked " + integer);
        }
        List<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.remove("one");
        arrayList.remove(0);
        for (String s : arrayList) {
            System.out.println("ArrayList " + s);
        }


        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("B");
        set.add("C");
        set.add("Z");
        set.add("D");
        for (String s : set) {
            System.out.println("Set = " + s);
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("Set iterator = " + next);
        }
        System.out.println("A".hashCode());
        System.out.println("B".hashCode());
        Integer a = 12;
        System.out.println(a.hashCode());
        Integer b = 13;
        System.out.println(b.hashCode());
    }



        }

