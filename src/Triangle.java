public class Triangle extends GeometrikFigura
{
    public int area(int a, int b, int c)
    {
        return  (((a+b+c)/2) * (((a+b+c)/2) - a) + ((a+b+c)/2 - b) + ((a+b+c)/2 - c) );
    }
    public int perimetr(int a, int b, int c)
    {
        return a + b + c;
    }

    public static void main(String[] args)
    {
     Triangle triangle = new Triangle();
        System.out.println(triangle.area(3, 4, 5));
        System.out.println(triangle.perimetr(5, 4, 3));
    }
}
