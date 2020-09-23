import java.util.Scanner;
public class OddEven{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number, or the execution can be stopped by entering -1: ");
        int num= input.nextInt();
        while(num!=-1){
            if(oddEven(num)==1)
                System.out.println("The " + num + " is Even" );
            else
                System.out.println("The " + num + " is Odd" );
            System.out.print("Please enter a number, or the execution can be stopped by entering -1: ");
            num= input.nextInt();
        }
    }
    public static int oddEven(int y){
        int m = y%2==0 ? 1 : 0;
        return  m;
    }
}
