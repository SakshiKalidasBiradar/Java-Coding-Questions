//Write a program to check whether year is leap or not
class Logic
{
    void CheckLeapYear(int iYear)
    {
        if( (iYear % 400 == 0) ||( (iYear % 4 == 0) && (iYear % 100 != 0) ) )
        {
            System.out.println("Leap Year");
        }
        else
        {
            System.out.println("Not Leap Year");
        }
       
        
    }     
}

class program11
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.CheckLeapYear(2024);
        
    }
    
}



    



