// using THis Key Word,,,, method we can access the propertry and methods
public class My110_SetGetThis {

    public static void main(String[] args){
        Pen p1=new Pen();
        p1.setSize(10);
        System.out.println(p1.getSize());
    }
    
}

class Pen{
    private int size;
    private String name;
    private String color;

    void setSize(int size){
        this.size=size;
    }
    int getSize(){
        return this.size;
    }

}