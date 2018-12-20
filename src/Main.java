import java.util.Arrays;

public class Main {
    public static void main (String[] args)
    {
        int[] arr = {1,2,3,4};
        int[][] diverseArr2D = {{3,6,7,3}, {2,5,6,3}, {3,6,2,11}, {12,1,3,5}};
        int[][] nondiverseArr2D = {{1,1,1,1}, {1,1,1,1}, {1,2,1,1}, {1,1,3,4,}};
        System.out.println("1D Array Sum: " + DWongLib.arraySum(arr));
        System.out.println("First 2D Array Row Sums: " + Arrays.toString(DWongLib.rowSums(diverseArr2D)));
        System.out.println("Is the first 2D array diverse: " + DWongLib.isDiverse(diverseArr2D));
        System.out.println("Second 2D Array Row Sums: " + Arrays.toString(DWongLib.rowSums(nondiverseArr2D)));
        System.out.println("Is the second 2D array diverse: " + DWongLib.isDiverse(nondiverseArr2D));
    }
    }