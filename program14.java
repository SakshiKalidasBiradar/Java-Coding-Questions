//Write a program to print digit of a number seperately
class Logic
{
    void PrintDigits(int iNo)
    {
        int iDigit = 0;
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iDigit = iNo % 10;
            iNo = iNo / 10;
            System.out.println(iDigit);

        }

        
    }     
}

class program14
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.PrintDigits(12345);
        
    }
    
}



    





