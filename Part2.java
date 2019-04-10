import java.util.Scanner;
/**
 * 
 * @author Qurrat-al-Ain Siddiqui
 */
public class Part2
{
    
    public Part2()
    {
        double average = calculateAverage();
        
        System.out.println(average);
        if (average < 50.0)
        {
            printFail();
        }else if (average < 80.0)
        {
            printPass();
        }else
        {
            printExcellent();
        }        
    }

    public double calculateAverage()
    {
        Scanner keyboard = new Scanner(System.in);
        double sum = 0;
        int count = 1;
        int numberModules = keyboard.nextInt();
        
        while (count <= numberModules)
        {
            double grade = keyboard.nextDouble();
            sum += grade;
            count ++;
        }
        
        double average = sum / numberModules;
        return average;
    }
    
    public static void printFail()
    {
        System.out.println("fail");
    }
    
    public static void printPass()
    {
        System.out.println("pass");
    }
    
    public static void printExcellent()
    {
        System.out.println("excellent");
    }
}
