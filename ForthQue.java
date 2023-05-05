public class ForthQue {

    public static int sum(int n ,int arr[])
    {
        if(n==1)
        {
            return arr[0];
        }
        return (arr[n-1]+ sum(n-1 , arr));
    }
    public static void main(String[] args) {
        int arr[] = {92, 23, 15, -20, 10};
        int n = arr.length;
        System.out.println(sum(n ,arr));
    }
}
