import java.util.Arrays;
import java.util.Scanner;

public class Trick {

   static  int ascendingNumber(int num){
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        int temp = Integer.parseInt(new String(digits));
        if(temp<1000){

                String s = Integer.toString(temp);
                s = "0" + s;
                 temp = Integer.parseInt(s);
            }
        return temp;
        }
   static  int descendingNumber(int num){
       if(num<1000){
           num = num *10;
       }
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        StringBuilder sb = new StringBuilder(new String(digits));
        sb.reverse();
        return Integer.parseInt(sb.toString());

    }

    static void number (){
       int result = 0,i = 1;
        System.out.println("Hello There!!");
        System.out.println("Here I will show a math trick! That is 6174 TRICK!!!");
        System.out.println("So , you have to choose a 4 digit number in which at least 2 number should be different.");
        System.out.println("And I will perform simple Subtraction by rearranging the number in ascending or descending order !");
        System.out.println("In the last the answer would be always 6174!!!!!");
        System.out.println("I will not change any digits !! rather i rearrange them in an order ");
        System.out.println("Enter a 4-Digit number with at least 2 number different !!");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Entered number is " + n);
        System.out.print("Here it goes!!!!!");
        result = descendingNumber(n)- ascendingNumber(n);
        System.out.println( "\nSubtraction 1  : " + descendingNumber(n) + " - "  + ascendingNumber(n)  + " = "+ result);
        while (result!=6174){
            i++;
            System.out.print("Subtraction "  + i + " : " + descendingNumber(result) + " - " + ascendingNumber(result) + " = ");
            if(result<1000){
                result = result*10;
            }
            result = descendingNumber(result) - ascendingNumber(result);
            System.out.print(result + "\n");
        }
        if(result==6174){
            System.out.println("\nThere you got !!! " + result + " in " + i + " steps");
        }
    }
    public static void main(String[] args) {
        number();
    }
}