public class Rectangle
{
    public static void main(String[] args)
    {
        double length, width;
        length = Double.parseDouble(args[0]);
        width = Double.parseDouble(args[1]);
        double area = length * width;
        double perimeter = 2 * (length + width);
        double diagonal = Math.sqrt(length * length + width * width);
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(diagonal);
    }
}