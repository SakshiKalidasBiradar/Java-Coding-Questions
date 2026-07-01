//write a program to check whether a number is Palindrome or not.
class Logic
{
    void CheckPalindrome(int iNo)
    {
        int iTemp = iNo;
        int iDigit = 0;
        int iRev = 0;

        while (iNo != 0)
        {
            iDigit = iNo % 10;
            iRev = (iRev*10)+iDigit;
            iNo = iNo / 10;
            
        }
        if(iTemp == iRev)
        {
            System.out.println("Palindrome Number");
        }
        else
        {
            System.out.println("Not Palindrome");
        }


    }
}
class program02
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.CheckPalindrome(121);

        
    }
    
}
