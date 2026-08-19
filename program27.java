//Accept String From User and convert it into camel case means first letter of word should be capital

/* Input : my name is amit
   output : My Name Is Amit

   Input : my NAMe is AmIt
   output : My Name Is Amit

*/
import java.util.*;
class program740
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);
        

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();                                                
        str = str.replaceAll("\\s+"," ");  

        str = str.toLowerCase();
        System.out.println(str);
          
    }
    
}
