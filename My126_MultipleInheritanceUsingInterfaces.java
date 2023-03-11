// Let's Achieve Multiple Inheritance Using Interface
class My126_MultipleInheritanceUsingInterfaces{
    public static void main(String [] args){

    }
}

interface Herbivore{
    void veg();
}

interface Carnivore{
    void nonVeg();
}

class Bear implements Herbivore,Carnivore{
    public void veg(){
        System.out.println("Eats Veg");
    }
    public void nonVeg(){
        System.out.println("Eats nonVeg");
    }
}