//Write program to find sum of digits of number
class Logic
{
    void SumOfDigits(int iNo)
    {
        int iDigit = 0;
        int iSum = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }

        System.out.println("Sum of digit is :"+iSum);
            

    }
}
class program01
{
    public static void main(String[] args)
    {
        Logic obj = new Logic();
        obj.SumOfDigits(1234);

    }

}