public class My119_HybridInheritance {
    public static void main(String[] args){

    }
}

//main class
class World{

    void world(){
        System.out.println("World");
    }
}

//sub class 1
class Continents extends World{

    void continents(){
        System.out.println("Continents");
    }
}

//sub class 2
class Ocean extends World{
    void ocean(){
        System.out.println("Ocean");
    }
}
//sub class 1.1
class Asia extends Continents{
    void asia(){
        System.out.println("Asia");
    }
}

//sub class 2.1
class Indian extends Ocean{
    void indian(){
        System.out.println("Indian");
    }
}

//sub class 1.1.1
class Country extends Asia{
    void country(){
        System.out.println("Desh");
    }
}

//sub class 1.1.1.1
class Bharat extends Country{
    void bharat(){
        System.out.println("Bharatiy");
    }
}