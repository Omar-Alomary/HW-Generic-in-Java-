import java.util.Arrays;
public class GenericMerge {
    public static void main(String[] args) {
        Integer[] f = {10, 20, 30, 40};
        Integer[] s = {50, 60, 70, 80, 90, 100};
        merge(f, s);
    }
    public static <T> void merge(T[] first, T[] second) {
        int firstSize = first.length;
        int secondSize = second.length;
        int newArrSize = firstSize + secondSize;
        T[] marge = (T[]) new Object[newArrSize];
        int counter = 0;
        for (int i = 0; i < newArrSize; i++) {
            if (i < firstSize) {
                marge[i] = first[i];
            } else {
                marge[i] = second[counter];
                counter++;
            } }
        System.out.println(Arrays.toString(marge)); }}