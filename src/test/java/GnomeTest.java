import org.junit.Assert;
import org.junit.Test;
public class GnomeTest {
    @Test
    public void test1() {
        int mas[] = {3, 5, 12, 26, 33, 42};
        int toSort[] = {5, 26, 33, 42, 3, 12};
        int sortMas[] = GnomeSort.gnomeSort(toSort);
        Assert.assertArrayEquals(mas, sortMas);
    }
    @Test
    public void test2() {
        int mas[] = {2, 2, 14, 17, 23, 23};
        int toSort[] = {2, 17, 23, 23, 2, 14};
        int sortMas[] = GnomeSort.gnomeSort(toSort);
        Assert.assertArrayEquals(mas, sortMas);
    }
    @Test
    public void test3() {
        int toSort[] = {0, 0, 0, 0, 0, 0};
        int sortMas[] = GnomeSort.gnomeSort(toSort);
        String str = sortMas.toString();
        Assert.assertArrayEquals(toSort, sortMas);

    }
    @Test
    public void test4() {
        int toSort[] = {1, 1, 1, 1, 1, 1};
        int sortMas[] = GnomeSort.gnomeSort(toSort);
        String str = sortMas.toString();
        Assert.assertArrayEquals(toSort, sortMas);

    }
}
