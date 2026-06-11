public class MergeSortedArrays {
    static void merge(int[] a, int[] b, int[] result) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k] = a[i];
                i++;
            } else {
                result[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            result[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            result[k] = b[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};
        int[] result = new int[a.length + b.length];

        merge(a, b, result);

        for (int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
