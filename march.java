import java.util.Scanner;
public class march{
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num%2==0)
        {
            System.out.println("the num is even");
        }
        else{
            System.out.println("the num is odd");
        }
    }
    
}

