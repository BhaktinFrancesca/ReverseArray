import java.util.Arrays;

public class ReverseArray {

    public int[] reverseArray(int[] a){

        int[] b = new int[a.length];

        for (int i = a.length - 1; i >= 0; i--){
            b[a.length - i - 1] = a[i];
        }
        return b;
    }

    public static void main(String[] args){

        ReverseArray rArray = new ReverseArray();

        //input
        int[] a = {3, 6, 7, 14, 30, 28, 100, 72, 61, 44, 2, 36};

        //calc
        int[] reversedArray = rArray.reverseArray(a);

        //sysout
        System.out.println("Your array is: " + Arrays.toString(a) + ". Au contraire: " + Arrays.toString(reversedArray) + ".");
    }
}
