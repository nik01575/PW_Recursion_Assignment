public class SecondQue {

    public static void main(String[] args) {
        
        int sum = 0;
        int sum1 = 0;
        for(int i=1;i<=5; i++)
        {
            if(i%2==0)
            {
                System.out.print(-i + " ");
                sum = sum + i;
            }
            else{
                System.out.print(+i + " ");
                sum1 = sum1 + i;
            }
        }
        System.out.println();
        
        int t_sum = -sum + sum1;
        System.out.println(t_sum);

    }
}
