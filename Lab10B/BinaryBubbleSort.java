package Lab10B;

public class BinaryBubbleSort {
    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void binarySearch(int array [], int target) {
        int low = 0;
        int high = array.length ;
        int count = 0;
        boolean key = true;

        while (low <= high && count < 5) {
            int mid = (low + high) / 2;
            System.out.println("Low is " + low);
            System.out.println();
            System.out.println("High is " + high);
            System.out.println();
            System.out.println("Mid is " + mid);
            System.out.println();

            if (target == array[mid]) {
                System.out.println("The target is in the set.");
                key = false;
                break;
            } else if (target > array[mid]) {
                low = mid;
                high = array.length ;
                System.out.println("Searching");
                System.out.println();
            } else {
                high = mid - 1;
                low = 0;
                System.out.println("Searching");
                System.out.println();
            }
            count++;

        }
        if (key)
            System.out.println("The target is not in the set");
    }

}
