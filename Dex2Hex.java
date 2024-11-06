import java.util.Scanner;

//A program which converts a decimal number to a hexadecimal number
class Dec2Hex
{
public static int Arg1;
    public static void main(String args[])    {
        //if no arguments are provided then this handles the error

        if (args.length == 0) {
            System.out.println("Please enter a valid decimal number");
            return;
        }
        try{
        Arg1 = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid decimal number");
            return;
        }
       
            char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int rem, num;
        num = Arg1;
        String hexadecimal="";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");
        
        //bug fix line because converter cannot process 0
        if (num == 0){
        hexadecimal = "0";
        }
        while(num != 0)
        {
            rem=num%16;
            hexadecimal= ch[rem] + hexadecimal;
            num= num/16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);

         
        
       

    }
}
