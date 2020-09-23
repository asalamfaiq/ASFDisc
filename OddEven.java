import java.util.Scanner;
public class OddEven{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number, or if you want to stop the execution enter -1: ");
        int num= input.nextInt();
        while(num!=-1){
            if(oddEven(num)==1)
                System.out.println("The number is Even" );
            else
                System.out.println("The number is Odd" );
            System.out.print("Enter a number, or if you want to stop the execution enter -1: ");
            num= input.nextInt();
        }
    }
    public static int oddEven(int y){
        int u = y%2==0 ? 1 : 0;
        return  u;
    }
}
