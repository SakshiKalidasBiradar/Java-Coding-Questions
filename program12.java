//Write a program to Display Grade of student based on marks 
class Logic
{
    void CheckLeapYear(int iMarks)
    {
        if(iMarks > 80)
        {
            System.out.println("A+ Grade");
        }
        else if(iMarks < 80 && iMarks >= 70)
        {
            System.out.println("A Grade");
        }
        else
        {
            System.out.println("B Grade");
        }
        
    }     
}

class program12
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.CheckLeapYear(20);
        
    }
    
}



    




