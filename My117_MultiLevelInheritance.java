public class My117_MultiLevelInheritance {
    public static void main(String args[]){
        Browsers b=new Browsers();
        b.nothing();
        b.open();
    }
}

class Apps{
    String name;
    int size;
    float speed;

    void open(){
        System.out.println("OPENED");
    }
}

//Single Level Inheritance Implimented
class Categories extends Apps{                           
    String type;

    void nothing(){
        System.out.println("Nothing");
    }
}

//Multi Level Inheritance Implimented
class Browsers extends Categories{
    String fetures;

    void browser(){
        System.out.println("Browser");
    }
}