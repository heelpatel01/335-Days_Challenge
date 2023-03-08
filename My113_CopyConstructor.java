public class My113_CopyConstructor {
    public static void main(String[] args){
        intern i1=new intern();
        i1.uName="Heel Patel";
        i1.num=123;
        intern i2=new intern(i1);
        System.out.println(i2.uName);
    }
}

class intern{
    String uName;
    int num;
    int pass;

    intern(){
        
    }
    intern(intern i1){
        this.uName=i1.uName;
        this.num=i1.num;
    }

}
