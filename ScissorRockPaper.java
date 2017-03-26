import java.util.Scanner;

public class ScissorRockPaper{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int comp = (int)(Math.random() * 3);
        System.out.print("Please enter scissor, rock or paper:  ");
        String user = input.nextLine().toUpperCase();
        
        switch(user){
            case "SCISSOR":
                if(comp == 0){System.out.println("draws!");}
                else if(comp == 1){System.out.println("user loses!");}
                else System.out.println("user wins!");
                break;
            case "ROCK":
                if(comp == 1){System.out.println("draws!");}
                else if(comp == 0){System.out.println("user wins!");}
                else System.out.println("user loses!");
                break;
            case "PAPER":
                if(comp == 2){System.out.println("draws!");}
                else if(comp == 0){System.out.println("user loses!");}
                else System.out.println("user wins!");
                break;
            default:
                System.out.println("Please enter a valid value!");
                break;
        }
    }
}