
//write a program to check number is perfect or not 
class Logic
{
    void CheckPerfect(int iNo)
    {
        int iCnt = 0;
        int iSum = 0;
        
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum+iCnt;

            }
        }
        if(iSum == iNo)
        {
            System.out.println(iNo + "perfect Number");
        }
        else
        {
            System.out.println(iNo + "Not perfect number");
        }

        
    }     
}
class program18
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.CheckPerfect(6);
        
    }
    
}



    


