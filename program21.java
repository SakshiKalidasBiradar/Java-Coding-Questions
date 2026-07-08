
//write a program to Calculate product of digitd of numberr
class Logic
{
    void ProductOfDigit(int iNo)
    {
       
        int iDigit = 0;
        int iMult = 1;
        
       while (iNo != 0)
       {
        iDigit = iNo % 10;
        iMult = iMult*iDigit;
        iNo = iNo / 10;

       }
       
        System.out.println("Product of digit is : "+iMult);
       
        
    }     
}

class program21
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.ProductOfDigit(123);
        
    }
    
}



    




