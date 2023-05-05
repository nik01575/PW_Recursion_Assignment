public class FirstQue
{
    public static int totalSum(int n)
    {

        if(n==0)
        {
            return 0;
        }
        int sum = n%10 + totalSum(n/10);
        
        return sum;
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(totalSum(n));
    }
}