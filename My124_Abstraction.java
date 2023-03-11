//Program Of Giving The Prference of how Class are giving first preference to their parents class

public class My124_Abstraction {
    public static void main(String [] args){
        RollsRoyce rr=new RollsRoyce();
    }
}

abstract class Vhiclesss{

    Vhiclesss(){
        System.out.println("Vhicles Class Waved You");
    }

}

class Carsss extends Vhiclesss{
    Carsss(){
        System.out.println("Cars Class Waved You");
    }
}

class RollsRoyce extends Carsss{
    RollsRoyce(){
        System.out.println("Rolls Royce Company Invites You");
    }
}