
public class FifthQue {
    public static boolean isArm(int n) {
        return n == getSum(n, getDigitCount(n));
    }
    
    public static int getSum(int n, int power) {
        return n == 0 ? 0 : (int) Math.pow(n % 10, power) + getSum(n / 10, power);
    }
    
    public static int getDigitCount(int n) {
        return n == 0 ? 0 : 1 + getDigitCount(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(isArm(153));
    }
}
