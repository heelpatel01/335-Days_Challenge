public class My86th_LargestString {
    public static void main(String[] args){
        String lords[]={"Deep","Heel","Harsh"};
        String largest=lords[0];

        for(int i=0;i<lords.length;i++){
            if(largest.compareToIgnoreCase(lords[i])<0){
                largest=lords[i];
            }
        }
        System.out.println(largest);
    }
}
