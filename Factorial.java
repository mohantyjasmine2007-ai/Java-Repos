import java.util.Scanner;
public class Factorial {
    public static int PrintFactorial(int n){
        //loop
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        PrintFactorial(n);
        sc.close();
    }    
}

