/*

Example:-18980
output:-08981

 */


public class My10th_Reversenumber {
    public static void main(String[] args){
        int number=18980;

        while(number>0){
            int lastdgt=number%10;
            System.out.print(lastdgt);
            number= number/10;
        }
    }
}
