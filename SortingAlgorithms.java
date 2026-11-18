import java.util.Arrays;

public class SortingAlgorithms {

    // Bubble Sort: magtan-aw sa magtapad nga numero ug mag-ilis kung sayop ang han-ay.
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Kung walay na-ilis, naka-ascending order na ang array.
            if (!swapped) {
                break;
            }
        }
    }

    // Selection Sort: pangitaon ang pinakagamay nga numero sa wala pa mahan-ay nga bahin.
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort: ibutang ang matag numero sa hustong posisyon sa naunang bahin.
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] original = {45, 12, 78, 3, 56, 23, 89, 1, 34, 67};

        // Tagsa-tagsa nga kopya aron dili mausab ang original array.
        int[] bubbleArray = Arrays.copyOf(original, original.length);
        int[] selectionArray = Arrays.copyOf(original, original.length);
        int[] insertionArray = Arrays.copyOf(original, original.length);

        System.out.println("Original Array: " + Arrays.toString(original));

        bubbleSort(bubbleArray);
        System.out.println("Bubble Sort:    " + Arrays.toString(bubbleArray));

        selectionSort(selectionArray);
        System.out.println("Selection Sort: " + Arrays.toString(selectionArray));

        insertionSort(insertionArray);
        System.out.println("Insertion Sort: " + Arrays.toString(insertionArray));
    }
}
