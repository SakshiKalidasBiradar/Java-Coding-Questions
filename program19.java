
//write a program to find largest digit in given Number
class Logic
{
    void FindLargestDigit(int iNo)
    {
       
        int iDigit = 0;
        int iMax = 0;
        
        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            iNo = iNo / 10;
 
        }
        System.out.println("Largest digit is : "+iMax);
       
        
    }     
}

class program19
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.FindLargestDigit(67838189);
        
    }
    
}



    


