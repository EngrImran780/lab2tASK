java.util.*;
public class menu{
    public static void main(String args[]){
        System.out.println("1,Biryani");
        System.out.println("2,Roll   ");
        System.out.println("3,pizza  ");
        System.out.println("4,Boarst ");
        System.out.println("5, Banana juice");
        System.out.println("6,Orange juice"); 
        Scanner sc = new Scanner(System.in);
       int menu=sc.nextInt();
         switch(menu){
          case 1: System.out.println("Biryani");
                  System.out.print("price 200"); 
                    break;
          case 2: System.out.println("Roll");
                  System.out.print(" Price 150");
                    break;
          case 3: System.out.println(" Pizza ");
                  System.out.print(" price 500");
                    break;
          case 4:System.out.println("Boarst");
                 System.out.print("price 250");
                    break;
          case 5:System.out.println("Banana");
                 System.out.print("price 60");
                    break;
          case 6:System.out.println("orange juice");
                 System.out.print("price 100");
                    break;
          default : System.out.print("invalid menu\nplease try another menu");
         }