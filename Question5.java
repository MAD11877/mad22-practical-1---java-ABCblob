import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Question5
{
  public static void main(String[] args)
  {
    /*
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * .
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);

    System.out.print("Enter number of integers: ");
    int num = in.nextInt();
    List<Integer> ints = new ArrayList<>();

    for (int i = 0; i < num; i++)
    {
      System.out.print(String.format("Enter integer (%o/%o): ",i+1,num));
      ints.add(in.nextInt());
    }
    Collections.sort(ints);
    int mode = Collections.frequency(ints, ints.get(0));
    System.out.println(String.format("Modal integer: %o", mode));


    in.close();

  }
}
