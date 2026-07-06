//Write a program to calculate power of number using loops
class Logic
{
    void calculatePower(int Base, int exp)
    {
        int iResult = 1;
        int iCnt = 0;
        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iResult = iResult*Base;
        }
        System.out.println("Power of number is : " +iResult);
        
    }     
}

class program15
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
        
    }
    
}



    





