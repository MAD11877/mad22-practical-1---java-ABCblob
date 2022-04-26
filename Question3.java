import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /*
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    int num = 1;
    
    while (true) 
    {
      System.out.print("Enter an integer (0 to stop): ");
      int new_num = in.nextInt();
      if (new_num == 0)
      {
        System.out.println("Exiting...");
        break;
      }
      num = num*new_num;
      System.out.println("Result: " + num);
    }



    in.close();

  }
}
