public class ThirdQue {

    public static int findMax(int n ,int arr[])
    {
        if(n==1)
        {
            return arr[0];
        }
        return Math.max(arr[n-1], findMax(n-1 , arr));
    }
    public static void main(String[] args) {
        int arr[] = { 13, 1, -3, 22, 5};
        int n = arr.length;
        System.out.println(findMax(n ,arr));
    }
}
