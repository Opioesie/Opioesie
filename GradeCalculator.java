import java.util.Scanner;
public class GradeCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the studfents score
        System.out.print("Enter the students score: ");
        int score= scanner.nextInt();
        
        // Convert the score to a range value for switch (using division)
        int range= score/10;
        // Dtermine the grade using switch statement
        char grade;
        switch (range) {
            case 10:
            case 9:
            grade='A';
            break;
            case 8:
            grade='B';
            break;
            case 7:
            grade= 'C';
            break;
            case 6:
            grade= 'D';
            break;
            case 5:
            grade= 'E';
            break;
            default:
            if (score >= 0 && score <= 49){
                grade= 'F';
            }
            else {
                grade= 'X'; // for invalid scores
            }
        }
        // Print the grade
        if (grade != 'X') {
            System.out.println("The grade is for the score" +  score  +  " is:"  + grade);
        }
        else{
            System.out.println("Invalid score entered,");
        }
        scanner.close();
    }
}