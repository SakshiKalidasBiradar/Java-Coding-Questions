//write a program to Count total number od factors of given number
class Logic
{
    void DisplayFactor(int iNo)
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
                iCount++;
                
            
            }

        }
        System.out.println("Total Factors are :"+iCount);

        
    }
}

class program24
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.DisplayFactor(50);
        
    }
    
}



    






