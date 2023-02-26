public class My99th_updateithBit {
public static int updateBit(int num,int i,int newBit){

    int bitMask=1<<i;
    if(newBit==0){
        return (bitMask & num);
    }
    return(bitMask | num);
    

}

public static void main(String[] args){
    System.out.println(updateBit(10, 2, 1));
}
}
