public class My114_CopyConstructor2 {

    public static void main(String[] args){

        Cons c1=new Cons();
        c1.name="Heel";
        c1.erNum=990;

        c1.marks[0]=95;
        c1.marks[1]=96;
        c1.marks[2]=99;

        Cons c2=new Cons(c1);

        c1.marks[0]=99;
        
        for(int i=0;i<c2.marks.length;i++){
            System.out.println(c1.marks[i]);
        }
    }
    
}
class Cons{
    String name;
    int erNum;
    int marks[]=new int[3];

    Cons(){

    }

    Cons(Cons c1){
        this.name=c1.name;
        this.erNum=c1.erNum;
        this.marks=c1.marks;
    }
}