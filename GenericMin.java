package generics;

import java.util.ArrayList;

public class GenericMin {

	public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(min(list));
        
    }

    public static <E extends Comparable<E>> E min(ArrayList<E> list) {
        E min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(min) < 0) {
                min = list.get(i);
            }
        }

        return min;
    }
}
