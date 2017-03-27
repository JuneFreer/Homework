public class Remainder
{
    public static void main(String[] args)
    {
        String[] week = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        int remainder = 30 % 7;
        String dueDay = week[2 + remainder];
        System.out.println(dueDay);
    }
}