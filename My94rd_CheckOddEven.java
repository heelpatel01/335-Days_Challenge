public class My94rd_CheckOddEven {
    public static String oddEven(int num){
        int tempnum=1;
        if((num&tempnum)==0){
            // System.out.println(num&tempnum);
            return "Even";
        }

        return "odd";
    }

    public static void main(String[] args){
        System.out.println(oddEven(110));
        System.out.println(oddEven(1100110));
        System.out.println(oddEven(11011));
    }
}
