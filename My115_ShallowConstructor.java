//by default constructors are shallow constructor

public class My115_ShallowConstructor {
    public static void main(String[] args){

        Cse c1=new Cse();
        c1.name="Heek";
        c1.num=31;
        c1.marks[0]=90;
        c1.marks[1]=93;
        c1.marks[2]=94;

        Cse c2=new Cse(c1);
         c1.marks[0]=95;
         for(int i=0;i<c1.marks.length;i++){
            System.out.println(c2.marks[i]);
         }

    }

}

class Cse{
    String name;
    int num;
    int marks[]=new int[3];

    Cse(){

    }

    Cse(Cse c1){
        this.name=c1.name;
        this.num=c1.num;
        this.marks=c1.marks;
    }
}


