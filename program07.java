
//write a program to print All Even Numbers upto N 
class Logic
{
    void PrintEven(int iNo)
    {
        int iCnt = 0;
       
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.print(iCnt);
    
            }

            
        }
        
    }     
}
class program07
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.PrintEven(20);
        
    }
    
}



    


