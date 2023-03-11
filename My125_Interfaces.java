public class My125_Interfaces {
    public static void main(String[] args){

        Queen qv=new Queen();
        qv.moves();

    }
}

interface Chess{
    void moves();   //By Default This Function is Abstracted And Public Also ...
    
/*  void name(){
        System.out.println("My name");  we can't implement the function in interface...that's why we can used it for achieving full ABSTRACTION
    }
*/

}

class Rook implements Chess{  
    public void moves(){
        System.out.println("Vertical,Horizontal");
    }
}

class Queen implements Chess{
    public void moves(){
        System.out.println("Vertical,Horizontal,Diagonal at all directions");
    }
}