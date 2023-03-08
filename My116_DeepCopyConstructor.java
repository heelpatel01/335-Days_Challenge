public class My116_DeepCopyConstructor {
    public static void main(String [] args){

        DeepCopy d1=new DeepCopy();
        d1.name="Heel Patel";
        d1.num=31;
        d1.marks[0]=98;
        d1.marks[1]=96;
        d1.marks[2]=97;

        DeepCopy d2=new DeepCopy(d1);           //Copied Data from d1 to d2...✅
        d1.marks[2]=100;                       //updated but It Will Not Change In d2 Object...✅

        for(int i=0;i<d1.marks.length;i++){
            System.out.println(d2.marks[i]);
        }

    }
}

class DeepCopy{
    String name;
    int num;
    int marks[]=new int[3];

    DeepCopy(){}

    DeepCopy(DeepCopy cn){
        this.name=cn.name;
        this.num=cn.num;
        for(int i=0;i<cn.marks.length;i++){        //📍📍📍Deep Copy Prevented...
            this.marks[i]=cn.marks[i];
        }
    }
}