public class Grade{
    public static void main(String[] args){
        String grade = args[0].toUpperCase();
        switch(grade){
            case "H":
                System.out.println("[85, 100]");
                break;
            case "D":
                System.out.println("[75, 84]");
                break;
            case "C":
                System.out.println("[65, 74]");
                break;
            case "E":
                System.out.println("[50, 64]");
                break;
            case "F":
                System.out.println("[0, 49]");
                break;
            default:
                System.out.println("You did not enter a valid value!");
                break;
        }
    }
}