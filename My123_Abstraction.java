public class My123_Abstraction {
    public static void main(String[] args){
        
        Dog d1=new Dog();
        d1.walk();

        Peacock p1=new Peacock();
        p1.walk();


        System.out.println(d1.color);  //it will print Brown Because "Whenever We Create An Object of child class it will Firstly Prefer The Constructor of Parent class then after it will prefer it's own constructors."  //for deeply explaination Se the file name --> "My124_Abstraction"

        // Animalss a1=new Animalss(); //We Can't Create Instance(object) of Abstracted class

    }
}

abstract class Animalss{   //Abstracted Class

    String color;
    Animalss(){  //we can create constructor also
        color="Brown";
    }

    void eat(){
        System.out.println("Animals Eats");
    }

    abstract void walk();  //we just gave one idea we have to not implement in current abstract class

    // abstract void talk(){
    //     System.out.println("Dont implement me if i am abstract function");
    // }

}

class Dog extends Animalss{  //this is Child class of animal so we have to must implement that abstracted 
                                // class walk

        void changeColor(){
            color="White";
        }


        void walk(){
            System.out.println("Walks on Four legs");
        }      
    
}

class Peacock extends Animalss{
    void walk(){
        System.out.println("Walks On Two Legs");
    }
}