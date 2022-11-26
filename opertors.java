import java.util.*;
public class operatars {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        int operators =sc.nextInt();
          switch(operators){
            case 1: System.out.print(x + y);
                    System.out.println("plus");
              break;
            case 2: System.out.print(x - y);
                    System.out.println("Subractions");
              break;
            case 3: System.out.print(x % y);
                    System.out.println("Division");
                    default: System.out.println("invalid Number\nplease Try Again");
                
          }       