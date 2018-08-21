/*
 * Example ListInterfaceDemo: show some example of java.util.List
 * objects in action, and how they can be interchanged.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class ListInterfaceDemo {

    // a method to print some information about any List object's contents
    public static void printListInfo(List<Integer> list) {
        
        // as long as we use only List operations here, it doesn't matter
        // what kind of List gets passed in
        System.out.println("List of type " + list.getClass() + " contains " + list.size() + " elements.");
        if (list.size() > 0) {
            
            int min, max, sum;
            Iterator<Integer> iter = list.iterator();
            min = iter.next();
            max = min;
            sum = min;
            while (iter.hasNext()) {
                int x = iter.next();
                if (x < min) min = x;
                if (x > max) max = x;
                sum += x;
            }
            System.out.println("  min = " + min + ", max = " + max + ", sum = " + sum + ".");
        }
    }
    
    public static void main(String[] args) {
        
        // we'll be putting in some random numbers...
        Random r = new Random();
        
        // let's build up a few list structures
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(r.nextInt(100));
        }
        List<Integer> vector = new Vector<Integer>();
        for (int i = 0; i < 10; i++) {
            vector.add(r.nextInt(100));
        }
        List<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(r.nextInt(100));
        }
        // a second name for one of the above
        List<Integer> altListName = arrayList;
        
        // the List interface implements Iterable, so we can use foreach
        System.out.print("Contents of arrayList:");
        for (int x : arrayList) {
            System.out.print(" " + x);
        }
        System.out.println();
        
        // or we can get the Iterator directly and use it
        System.out.print("Contents of vector:");
        Iterator<Integer> iter = vector.iterator();
        while (iter.hasNext()) {
            System.out.print(" " + iter.next());
        }
        System.out.println();
        
        // or use a for loop with get to grab each element
        System.out.print("Contents of linkedList:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(" " + linkedList.get(i));
        }
        System.out.println();
        
        // or we can ask the List for its contents as an array, even
        System.out.print("Contents of altListName:");
        Object[] array = altListName.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println();
        
        // print out some information about each using a method defined above
        printListInfo(arrayList);
        printListInfo(vector);
        printListInfo(linkedList);
    }
}
