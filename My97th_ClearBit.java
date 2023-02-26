public class My97th_ClearBit {
    public static int ClearBit(int num,int i){
        int bitmask=1<<i;

        return (bitmask^ num);

        
    }

    public static void main(String[] args){
        System.out.println(ClearBit(10, 1));
    }
}
