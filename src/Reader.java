import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader
{
    private Scanner scanner = new Scanner(System.in);
    public String scanString()
    {
        String input = scanner.nextLine();
        return input;
    }


    public int scanInt()
    {
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }

//    public static void main(String[] args)
//    {
//        Reader r = new Reader();
//        Integer.parseInt("Ahmad");
//        r.nourUser("t");
//        System.out.println("happy");
//    }

    public void nour(String input) throws IllegalAccessException
    {
        if (input.equals("bye"))
            throw new IllegalAccessException("You can't enter this word");

        if (input.equals("t")) {
            List<Integer> l = new ArrayList<>();
            int x = l.get(100); // throw IndexOutOfBound
        }
    }

    public void nourUser(String input)
    {
        try
        {
            nour(input);
        }
        catch (IllegalAccessException e)
        {
            System.out.println("Habibi you can't use bye ,...");
        }
        catch (Exception e)
        {
            //System.out.println(e.toString());
            System.out.println("can you enter anothe input because the list is now empty");
        }


    }


}
