//write a program to find the maximum of two numbers 
class Logic
{
    void FindMax(int a,int b)
    {
        if(a>b)
        {
            System.out.println("Maximum Number is:"+a);
        }
        else
        {
            System.out.println("Maximum Number is : "+b);
        }
        

    }
}
class program03
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.FindMax(12,20);

        
    }
    
}

