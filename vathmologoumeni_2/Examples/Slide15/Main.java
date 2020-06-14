public class Main
{
    public static void main(String[] args)
    {
        System.out.println(findMin(1,2,4));
    }

    public static int findMin(int... ints)
    {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++)
        {
            if (ints[i] < min)
                min = ints[i];
        }

        return min;
    }
}