public class My129_SuperKeyWord {
    public static void main(String [] args){

        Horse210 h10=new Horse210();

    }
}

class Animals420{

    String color;

    Animals420(){
        System.out.println("Animal");
    }
}

class Horse210 extends Animals420{
    Horse210(){
        super();
        super.color="pink";  //This is how we can acces the parent class properties using Super keyword.
        System.out.println("Horse");
    }
}
