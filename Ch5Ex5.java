package ch5ex5;
import java.util.Scanner;

public class Ch5Ex5 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
            int grade;
            
        System.out.println("Enter your percentage grade");
            grade=input.nextInt();
            
                if(grade>=90){
                    System.out.println("You got an A!");
                }
                else if(grade>=80){
                    System.out.println("You got a B");
                }
                else if(grade>=70){
                    System.out.println("You got a C");
                }
                else if(grade>=60){
                    System.out.println("You got a D");
                }
                else{
                    System.out.println("You got an F");
                }
    }
    
}
