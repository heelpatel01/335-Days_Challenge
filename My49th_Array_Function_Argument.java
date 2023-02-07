public class My49th_Array_Function_Argument {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
            }
        }
    

    public static void main(String[] args){
        int marks[]={80,20,10};

        // System.out.println("Before:- ");

        // for(int i=0;i<=marks.length;i++){
        //     System.out.println(marks[i]);
        // }

        update(marks);

        System.out.println("After Updation:- ");
        
        for(int i=0;i<=marks.length;i++){
            System.out.println(marks[i]);
        }

    }
}
