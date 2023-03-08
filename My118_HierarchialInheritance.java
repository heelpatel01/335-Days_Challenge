public class My118_HierarchialInheritance {
    public static void main(String [] args){
        Games g1=new Games();
        g1.applications();;
        g1.games();

        Browser b1=new Browser();
        b1.browser();
    }
}

class Applications{
    int size;
    
    void applications(){
        System.out.println("apps");
    }
}
class Games extends Applications{
    void games(){
        System.out.println("games");
    }
}
class Browser extends Applications{
    void browser(){
        System.out.println("browser");
    }
}