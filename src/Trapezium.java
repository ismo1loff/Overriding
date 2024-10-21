public class Trapezium
{
    public int area(int a, int b, int c)
    {
        return  (a + b)/2 * c;
    }
    public int perimetr(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void main(String[] args)
    {
        Trapezium trapezium = new Trapezium();
        System.out.println(trapezium.area(6, 8, 10));
        System.out.println(trapezium.perimetr(6, 8, 10));
    }
}
