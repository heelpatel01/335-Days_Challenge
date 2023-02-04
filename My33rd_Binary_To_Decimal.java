public class My33rd_Binary_To_Decimal {

    public static void btod(int bn){


        

        int power=0;

        int dn=0;

        while(bn>0){
            
            int ld;

            ld=bn%10;

            dn= dn+ ld*(int)(Math.pow(2, power));

            power=power+1;


            bn=bn/10;
        }
        System.out.println(dn);
    }

    public static void main(String[] args){

        btod(101);

    }
    
}
