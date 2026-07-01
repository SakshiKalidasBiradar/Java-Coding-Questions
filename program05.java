//write a program to find minimum of three numbers 
class Logic
{
    void PrintTable(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1;iCnt <= 10;iCnt++)
        {
            System.out.println(iNo*iCnt);
        }
        

    }
}
class program05
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.PrintTable(5);
        
    }
    
}



    

