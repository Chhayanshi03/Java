import java.util.Scanner;

public class grade_system {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of student: ");
        int mark = sc.nextInt();

        if(mark>=90){
            System.out.println("The grade of students for "+mark+" marks is A");
        }
        else if(mark<90 && mark>=80){
            System.out.println("The grade of students for "+mark+" marks is B");
        }
        else if(mark<80 && mark>=70){
            System.out.println("The grade of students for "+mark+" marks is C");
        }
        else if(mark<70 && mark>=60){
            System.out.println("The grade of students for "+mark+" marks is D");
        }
        else if(mark<60 && mark>=50){
            System.out.println("The grade of students for "+mark+" marks is E");
        }
        else if(mark<50){
            System.out.println("The grade of students for "+mark+" marks is F");
        }

        sc.close();
    }
}
