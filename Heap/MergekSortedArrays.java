package DSA;
import java.util.*;
public class MergekSortedArrays {
	public static void mergeKArrays(int[][] arr, int a,
            int[] output)
{
int c = 0;

for (int i = 0; i < a; i++) {
for (int j = 0; j < 4; j++)
output[c++] = arr[i][j];
}

Arrays.sort(output);
}

public static void printArray(int[] arr, int size)
{
for (int i = 0; i < size; i++)
System.out.print(arr[i] + " ");
}

public static void main(String[] args)
{
int[][] arr = { { 2, 6, 12, 34 },
{ 1, 9, 20, 1000 },
{ 23, 34, 90, 2000 } };
int k = 4;
int n = 3;
int[] output = new int[n * k];

mergeKArrays(arr, n, output);

System.out.println("Merged array is ");
printArray(output, n * k);
}

}
