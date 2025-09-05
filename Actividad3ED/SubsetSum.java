package Actividad3ED;

public class SubsetSum {
    public static boolean subsetSum(int[] arr, int n, int suma) {
        if (suma == 0) {
            return true;
        }
        if (n == 0 && suma != 0) {
            return false;
        }
        return subsetSum(arr, n - 1, suma) || 
               subsetSum(arr, n - 1, suma - arr[n - 1]);
    }
}


