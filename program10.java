//Write a program to check whether a number is positive negative or zero
class Logic
{
    void CheckPoNeZero(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println("Positive Number");
        }
        else if(iNo == 0)
        {
            System.out.println("Number is Zero");
        }
        else
        {
            System.out.println("Negative Number");
        }
        

    }     
}

class program10
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.CheckPoNeZero(-8);
        
    }
    
}



    


