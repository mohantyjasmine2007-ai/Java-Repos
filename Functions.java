import java.util.Scanner;
public class Functions {
    public static int CalculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
   public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter a: ");
    int a =sc.nextInt();
    System.out.println("Enter b: ");
    int b =sc.nextInt();

    int sum=CalculateSum(a, b);
    System.out.println(sum);
    sc.close();
   }
}
