/**
 * mergeSort
 */
public class mergeSort {
    public static void merge(int[] a, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;
            merge(a, l, mid);
            merge(a, mid + 1, r);
            mergeAll(a, l, mid, r);
        }
    }

    private static void mergeAll(int[] a, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int la[] = new int[n1];
        int ra[] = new int[n2];
        for (int x = 0; x < n1; x++)
            la[x] = a[l + x];
        for (int x = 0; x < n2; x++)
            ra[x] = a[(mid + 1) + x];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2)
            if (la[i] <= ra[j])
                a[k++] = la[i++];
            else
                a[k++] = ra[j++];
        while (i < n1)
            a[k++] = la[i++];
        while (j < n2)
            a[k++] = ra[j++];
    }

    public static void main(String[] args) {
        int arr[] = { 12, 32, 1, 2, 4, 29, 9 };
        for (int n : arr)
            System.out.print(n + " ");
        merge(arr, 0, arr.length - 1);
        System.out.println();
        for (int n : arr)
            System.out.print(n + " ");
    }
}