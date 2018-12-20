public class DWongLib {
    public static int arraySum(int[] arr)
    {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
        {
            count = count + arr[i];
        }
        return count;
    }

    public static int[] rowSums(int[][] arr2d)
    {
        int[] returnArray = new int[arr2d.length];
        for(int i = 0; i < arr2d.length; i++)
        {
            returnArray[i] = arraySum(arr2d[i]);
        }
        return returnArray;
    }

    public static boolean isDiverse(int[][] arr2d)
    {
        int[] summary = rowSums(arr2d);
        for(int i= 0; i < arr2d.length; i++)
        {
            for(int j = 0; j < arr2d.length; j++)
            {
                if(summary[i] == summary[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
