
//write a program to check whether number is prime or not
class Logic
{
    void ChkPrime(int iNo)
    {
        int iCnt = 0;
        boolean flag = true;
        for(iCnt = 2; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                flag = false;
                break;
            }

            
        }
        if(flag == true)
        {
            System.out.println(iNo+" is Prime");
        }
        else
        {
            System.out.println(iNo + "is not prime");
        }
        

    }
}
class program06
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.ChkPrime(11);
        
    }
    
}



    

