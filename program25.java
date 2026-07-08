//write a program to print all numbers from 1 to n that are divisible by both 2 nd 3
class Logic
{
    void PrintDivisibleBy2And3(int iNo)
    {
        int iCnt = 0;
    
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0 && iCnt % 3 == 0)
            {
                System.out.println(iCnt);
                
            }
        }
        
    }
}

class program25
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.PrintDivisibleBy2And3(50);
        
    }
    
}



    







