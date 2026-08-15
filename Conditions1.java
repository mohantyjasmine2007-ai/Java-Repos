import java.util.*;
public class Conditions1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A: ");
        int a=sc.nextInt();
        System.out.println("Enter B: ");
        int b=sc.nextInt();
        
        if(a==b){
            System.out.println("Equal");
        }else if(a>b){
                System.out.println("A is greater than B");
            }else{
                System.out.println("B is greater ");
        }
        sc.close();
     }
}

//if ,else if,else
