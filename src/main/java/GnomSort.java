import org.junit.Test;
import java.util.Arrays;
class GnomeSort {
    @Test
    public static int[] gnomeSort(int arr[])
    {
        int index = 1;

        while (index < arr.length) {
            if (arr[index-1] <= arr[index]) {
                index++;
            }
            else {
                int temp = arr[index-1];
                arr[index-1] = arr[index];
                arr[index] = temp;
                if (index > 1) {
                    index--;
                }
            }

        }
        return arr;
    }
    public static void main(String[] args)
    {
        int arr[] = { 23, 11, -8, 7, -3, 3 };
        int sortMas[] =  gnomeSort(arr);
        System.out.print("Гномья сортировка: ");
        System.out.println(Arrays.toString(arr));
    }
}