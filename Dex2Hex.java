import java.util.Scanner;

//altering comment here to test Jenkins automation
class Dec2Hex
{
public static int Arg1;
    public static void main(String args[])    {
        if (args.length == 0) {
            System.out.println("Please enter a valid number");
            return;
        }

        try {
            // Attempt to pass Arg1 as an integer
            Arg1 = Integer.parseInt(args[0]);
        } 
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
            return;
        }
        char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

    }
}
