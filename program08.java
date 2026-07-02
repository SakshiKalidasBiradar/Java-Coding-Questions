

//write a program to print All odd Numbers upto N 
class Logic
{
    void PrintOdd(int iNo)
    {
        int iCnt = 0;
       
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 != 0)
            {
                System.out.print(iCnt);
    
            }

            
        }
        
    }     
}
class program08
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.PrintOdd(20);
        
    }
    
}



    


