public class my102_check2sPower {
    public static Boolean CheckTwosPower(int num){
        return ((num & (num-1))==0);
    }

    public static void main(String []args){
        System.out.println(CheckTwosPower(18));
    }
}
