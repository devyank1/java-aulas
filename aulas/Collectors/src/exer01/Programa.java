package exer01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Programa {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();

        l.add(45);
        l.add(22);
        l.add(99);
        l.add(13);
        l.add(24);

        Collections.sort(l);

        for (Integer i : l){
            System.out.println(i);
        }
    }
}
