//write a program to Display all factors of given number
class Logic
{
    void DisplayFactor(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println(iCnt);
                
            
            }

        }

        
    }
}

class program23
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.DisplayFactor(50);
        
    }
    
}



    





