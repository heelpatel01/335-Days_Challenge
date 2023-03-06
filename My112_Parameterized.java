
public class My112_Parameterized {

    public static void main(String[] args){
        Google g1=new Google();      //it will match parameters
        Google g2=new Google("Heel Patel");  
        Google g3=new Google(10000000);
        // Google g4=new Google("Alpha",20000000);  //it will not called bcz this type of constructor doesn't exist with 2 parameters where first is Steing and Second is Integer.
    
        // g1.Package=10;
    }
    
}

class Google{
    String name;
    int numbersOfCandidates;
    int Package;

    Google(){
        System.out.println("Congrats");
    }

    Google(String name){
        this.name=name;
    }
    Google(int Package){
        this.Package=Package;
    }
}


//this all are Example of Constructor overloading where we calling diffrent diffrent constructors. and it is matching by it self.
//this is also example of PolyMorphism where there is many forms of Constructors