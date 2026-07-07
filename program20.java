
//write a program to find Smallest digit in given Number
class Logic
{
    void FindSmallestDigit(int iNo)
    {
       
        int iDigit = 0;
        int iMin = 9;
        
        while (iNo != 0) 
        {
            iDigit = iNo % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            iNo = iNo / 10;
 
        }
        System.out.println("Smallest digit is : "+iMin);
       
        
    }     
}

class program20
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.FindSmallestDigit(67838189);
        
    }
    
}



    



