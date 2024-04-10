package Comparetor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class AddingTwolist {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {
        ArrayList t1=new ArrayList<>();
        t1.add(10);
        t1.add(50);
        t1.add(20);

        ArrayList t2=new ArrayList<>();
        t2.add(3);
        t2.add(10);
        t2.add(5);
      
        ArrayList t3=new ArrayList<>();
        t3.addAll(t1);
        t3.addAll(t2);

        Collections.sort(t3, Comparator.reverseOrder());
    System.out.println(t3);

    }
}
