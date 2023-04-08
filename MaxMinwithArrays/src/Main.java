import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {15,12,788,1,-1,-778,2,0};

        System.out.println("Array: "+Arrays.toString(array));

        Arrays.sort(array);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();

        for(int i = 0; i < array.length; i++) {
            if(array[i] > number) {
                System.out.println("The nearest number smaller than the entered number: " + array[i-1]);
                break;
            }
        }

        for(int j = 0; j <  array.length; j++) {
            if(array[j] > number) {
                System.out.println("The nearest number greater than the entered number: " + array[j]);
                break;
            }
        }
    }
}
