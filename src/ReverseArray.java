import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter a size: ");
            size = keyboard.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Enter element " + (i + 1) + " : ");
            array[i] = keyboard.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }

        for (int j = 0; j < size/2; j++) {
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + "\t");
        }
    }

}
