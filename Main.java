import java.util.*;
//String[] args
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean stop = false;
        ArrayList<String> words = new ArrayList<String>();
        
        while(stop = false)
        {
            words.add(scan.nextLine());
            if (words.get(words.size()-1).equals("STOP"))
            {
                words.remove(words.size()-1);
                stop = true;
            }
        }
        for (int i = 0; i < words.size(); i++)
        {
            if (words.get(i).indexOf("a") != -1)
            {
                System.out.println(words.get(i));
            }
        }
    }
}
