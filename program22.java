
//write a program to Count how many even and odd numbers are there between 1 to n
class Logic
{
    void ProductOfDigit(int iNo)
    {
        int iCnt = 0;
        int iEven = 0;
        int iOdd = 0;
        for(iCnt =1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
        }

        System.out.println("Even Numbers : " + iEven);
        System.out.println("Odd numbers : " + iOdd);

        
    }     
}

class program22
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.ProductOfDigit(50);
        
    }
    
}



    





