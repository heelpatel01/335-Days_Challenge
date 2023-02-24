public class My91th_CountLowercaseVowels {
    public static int CountLowWove(String str){
        int count=0;
        
        for(int i=0;i<str.length();i++){
            Character ch=str.charAt(i);
            if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        String str="Heel Patel";
        System.out.println(CountLowWove(str));
    }
}
