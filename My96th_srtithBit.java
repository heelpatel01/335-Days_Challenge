public class My96th_srtithBit {
    public static int setBit(int num,int i){
        int bitMask=1<<i;
        return (bitMask|num);
    }

    public static void main(String args[]){
        System.out.println(setBit(10, 2));
    }
}
