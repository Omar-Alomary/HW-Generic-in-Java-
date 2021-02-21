
import java.util.Arrays;
public class GenericReverse {
    public static <T> void   Reverse(T number[]){
            int n= number.length-1;
            for (int i = 0; i < number.length/2; i++) {
              T t;
                t= (T) number[i];
                number[i]=number[n];
                number[n]=t;
                n--; } }
    public static void main(String[] args) {
            Integer []num={100,200,300,400};
            Reverse(num);
        System.out.println(Arrays.toString(num)); }}









