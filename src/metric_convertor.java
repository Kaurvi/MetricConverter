import java.util.Scanner;

public class metric_convertor
{
    private static boolean done;

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double meters=0.0;
        double miles =0.0;
        double feet=0.0;
        double inches =0.0;
        String continueYN= ("Y/N");
        String trash ="";
    done =false;
        do {
            // Prompt for input:
            System.out.print("Enter the value in meters: ");
            if (in.hasNextDouble())
            {
                meters = in.nextDouble();
                in.nextLine();
                miles = meters * 0.0062;
                inches = meters*3.370;
                feet = meters*3;
                { System.out.print("The converted value in miles is; "+miles +"  ");}
                {System.out.println("The converted value in feet; "+feet);}
                {System.out.println("The converted values in inches; "+inches);}
                continueYN = in.nextLine();
                if(continueYN.equalsIgnoreCase("N"))
                    done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("You must enter a valid value not: " + trash + "\n");
            }
        }while (!done);
        }
    }