public class BinSearch {

    /**
    Binary search on an array of int

    @param elts input array
    @param findElt int to find in the array
    @pre elts is sorted in ascending order
    @return index of findElt in elts, or -1 if not found
     */
    public static int search (int[] elts, int findElt) {
        return binsearch(elts, 0, elts.length -1, findElt);
    }

    /**
    Helper method for binary search on array of int

    @param elts entire input array
    @param low lowest index where findElt may be found
    @param high highest index where findElt may be found
    @param findElt int to find in the array
    @return index of findElt in elts, or -1 if not found
     */
    protected static int binsearch(int[] elts, int low, int high, int findElt) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (findElt < elts[mid])       // findElt can only be in 1st half
                return binsearch(elts, low, mid - 1, findElt);
            else if (elts[mid] < findElt)  // findElt can only be in 2nd half
                return binsearch(elts, mid + 1, high, findElt);
            else                           // found findElt!
                return mid;
        }
        else
            return -1;                  // Didn't find findElt.
    }

    /**
    Binary search on an array of Comparable objects

    @param elts input array
    @param findElt Comparable to find in the array
    @pre all elts and findElt must implement Comparable
    @pre elts is sorted in ascending order
    @return index of findElt in elts, or -1 if not found
     */
    public static <T extends Comparable> int search (T[] elts, T findElt) {
        return binsearch(elts, 0, elts.length -1, findElt);
    }

    /**
    Helper method for binary search on array of Comparables

    @param elts entire input array
    @param low lowest index where findElt may be found
    @param high highest index where findElt may be found
    @param findElt Comparable to find in the array
    @return index of findElt in elts, or -1 if not found
     */
    protected static <T extends Comparable> int binsearch(T[] elts, int low, int high, T findElt) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (findElt.compareTo(elts[mid]) < 0)  // it must be in 1st half
                return binsearch(elts, low, mid - 1, findElt);
            else if (elts[mid].compareTo(findElt) < 0)  // in 2nd half
                return binsearch(elts, mid + 1, high, findElt);
            else                           // found findElt!
                return mid;
        }
        else
            return -1;                  // Didn't find findElt.
    }

    /**
    Demonstration of linear and binary searches
     */
    public static void main(String[] args) {

        final int size = 100;
        int[] orderedInts = new int[size];
        Integer[] orderedIntegers = new Integer[size];

        for (int i=0; i<size; i++) {
            // some ordered and not very random numbers
            orderedInts[i] = 2*i;
            orderedIntegers[i] = new Integer(2*i);
        }

        // do some searching for some random-ish values, some of which are
        // in the arrays and some of which are not
        for (int i=3; i<2*size; i+=5) {
            System.out.println("Searching for "+i+":");
            System.out.println("int array: " + search(orderedInts, i));
            System.out.println("Integer array: " + 
                search(orderedIntegers, i));
        }
    }
}