import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string :");
        String orignal = sc.nextLine();

        String reversed ="";
        for (int i = orignal.length() -1; i>= 0; i--){
            reversed = reversed + orignal.charAt(i);

        }
        if(orignal.equals(reversed)){
            System.out.println("palindrome");

        }
        else {
            System.out.println("not palindrome ");
        }
        sc.close();


    }
}
