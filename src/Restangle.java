public class Restangle
{
    public int area(int a, int b)
    {
        return a * b;
    }
    public int perimetr(int a, int b)
    {
        return 2*(a + b);
    }

    public static void main(String[] args)
    {
        Restangle restangle = new Restangle();
        System.out.println("Yuza = " +  restangle.area(4, 5));
        System.out.println("Perimetr = " + restangle.perimetr(4, 5));
    }
}
