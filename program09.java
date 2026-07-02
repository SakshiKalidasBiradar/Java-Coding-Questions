
//write a program to print Sum of Even and odd digits seperately in Number 
class Logic
{
    void SumOfEvenOdd(int iNo)
    {
        int iDigit = 0;
        int EvenSum = 0;
        int OddSum = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                 EvenSum = EvenSum + iDigit;
            }
            else
            {
                OddSum = OddSum + iDigit;
            }
        }
        System.out.println("Even Digits Are : "+EvenSum);
        System.out.println("Odd Digits Are : "+OddSum);
       
        
        
    }     
}
class program09
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.SumOfEvenOdd(123456);
        
    }
    
}



    


