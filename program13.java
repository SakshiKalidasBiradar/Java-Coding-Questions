//Write a program to check whether number is dividible by 5 and 11 or not
class Logic
{
    void CheckDivisible(int iNo)
    {
        if( (iNo % 5 == 0) && (iNo % 11 == 0) )
        {
            System.out.println(iNo +"is divisible by 5 and 11");
        }
        else
        {
            System.out.println(iNo +"is not divisible by 5 and 11");
        }
        
    }     
}

class program13
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.CheckDivisible(55);
        
    }
    
}



    





