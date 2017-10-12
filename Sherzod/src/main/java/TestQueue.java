import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Sherzod on 12/10/2017.
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue<String>  strings = new LinkedList<String>();
        for (int i = 0; i < 2; i++) {
            strings.add("i="+i);
        }
        Collection collection = new ArrayList();
        collection.add("Alo");
        collection.add("Sallom");
        collection.add("Hello");
        collection.add("Zdrasti");
        collection.add(1);
        strings.addAll(collection);

        System.out.println(strings);

        Set<Integer>  numbers  = new HashSet<Integer>();
        numbers.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,6,7,8,9}));

        numbers.add( 1);
        System.out.println(numbers);
        Set<Integer> numbers2 = new SortedSet<Integer>() {
            public Comparator<? super Integer> comparator() {
                return null;
            }

            public SortedSet<Integer> subSet(Integer fromElement, Integer toElement) {
                return null;
            }

            public SortedSet<Integer> headSet(Integer toElement) {
                return null;
            }

            public SortedSet<Integer> tailSet(Integer fromElement) {
                return null;
            }

            public Integer first() {
                return null;
            }

            public Integer last() {
                return null;
            }

            public int size() {
                return 0;
            }

            public boolean isEmpty() {
                return false;
            }

            public boolean contains(Object o) {
                return false;
            }

            public Iterator<Integer> iterator() {
                return null;
            }

            public Object[] toArray() {
                return new Object[0];
            }

            public <T> T[] toArray(T[] a) {
                return null;
            }

            public boolean add(Integer integer) {
                return false;
            }

            public boolean remove(Object o) {
                return false;
            }

            public boolean containsAll(Collection<?> c) {
                return false;
            }

            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            public boolean retainAll(Collection<?> c) {
                return false;
            }

            public boolean removeAll(Collection<?> c) {
                return false;
            }

            public void clear() {

            }
        };
        numbers2.addAll(Arrays.asList(new Integer[] {1,2,5,2,3,7,3,1,8,0,8,9,6,5}));
        System.out.println(numbers2.toArray());
        Collections.addAll(collection, numbers2.toArray());
        System.out.println(collection);

    }
}
