import java.util.Scanner;
  
class inputprog{
    public static void main (String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name :\n");
        String name = input.next();

        System.out.println("Your name is :\t"+name);
    }
}  