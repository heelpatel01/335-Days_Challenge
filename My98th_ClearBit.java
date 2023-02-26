//Second Method For Clearing Bit

public class My98th_ClearBit {
    public static int ClearBit(int num,int i){
        int BitMask= (~(1<<i));
        return num&BitMask;
    }

    public static void main(String args[]){
        System.out.println(ClearBit(10, 1));
    }
}
