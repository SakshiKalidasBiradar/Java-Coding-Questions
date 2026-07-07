
//write a program to print Sum of All Even Numbers upto N 
class Logic
{
    void SumEven(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
       
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSum = iSum+iCnt;
                
            }
        }
        System.out.println("Sum Of Even Numbers is : "+iSum);
    }     
}
class program16
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.SumEven(20);
        
    }
    
}



    


