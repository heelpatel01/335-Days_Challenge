public class my101_ClearRangeofBits {
    public static int ClearRangeOfBits(int num,int start,int end){
        int a=(~0)<<end+1;
        int b=(1<<start)-1;

        return (a|b)&num;

    }

    public static void main(String[] args){
        System.out.println(ClearRangeOfBits(21, 2, 4));
    }
}
