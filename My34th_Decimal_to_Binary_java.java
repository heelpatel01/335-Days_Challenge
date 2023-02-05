//binary to decemal


public class My34th_Decimal_to_Binary_java {
    public static void dtob(int dec){
        int reminder;
        int power=0;
        int bin=0;
        while(dec>0){

            reminder=dec%2;            


            bin = bin+(reminder*(int)Math.pow(10, power));

            power++;

            dec=dec/2;

        }
        System.out.println(bin);
    }

    public static void main(String[] args){
        dtob(9999);
    }
}
