public class OddEven{
    public static void main(String[] args) {
        int num=3;
        while(num!=-1){
            if(oddEven(num)==1)
                System.out.println("The number is Even" );
            else
                System.out.println("The number is Odd" );
            System.out.print("Enter a number, or if you want to stop the execution enter -1: ");
            num= input.nextInt();
        }
    }
}
