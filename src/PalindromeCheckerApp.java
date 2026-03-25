import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a string : ");
        String original = sc.nextLine();

        char[] arr = original.toCharArray();

        int start = 0;
        int end = arr.length -1;
        boolean ispalindrome = true;

        while(start<end){
            if(arr [start ] != arr [end]){
                ispalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if (ispalindrome){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("not Palindrome");
        }
        sc.close();




    }
}
