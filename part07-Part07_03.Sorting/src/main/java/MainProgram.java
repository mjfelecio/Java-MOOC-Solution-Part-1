import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array) {
        int smallestNumber = array[0];

        for(int i: array) {
            if (i < smallestNumber) {
                smallestNumber = i;
            }
        }
        return smallestNumber;
    }

    public static int indexOfSmallest(int[] array) {
        int smallestNumber = smallest(array);

        for(int i = 0; i < array.length; i++) {
            if (array[i] == smallestNumber) {
                return i;
            }
        }
        return -1;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        if (startIndex < 0 || startIndex >= array.length) {
            return -1;
        }

        int smallestNumber = array[startIndex];
        int indexOfSmallest = startIndex;

        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }


    public static void swap(int[] array, int index1, int index2) {
       int num1 = array[index1];
       int num2 = array[index2];

       array[index1] = num2;
       array[index2] = num1;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {

            swap(array, i, indexOfSmallestFrom(array, i));

            System.out.println(Arrays.toString(array));
        }
    }

}
