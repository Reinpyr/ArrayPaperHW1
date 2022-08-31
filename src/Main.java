import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arvot = {2,5,-3,11,193,-2};
        int summa = 0;
        for(int i = 0; i < arvot.length; i = i + 1)
        {
            summa = summa + arvot[i];
        }
        System.out.println(Arrays.toString(arvot));
        System.out.println(summa);
    }
}