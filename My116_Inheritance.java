public class My116_Inheritance {
    public static void main(String[] args){

        FrontEndDev fd=new FrontEndDev();
        fd.mNum=10;                       //We used proprtey of Team class Propertey(mNumm) using FrontendDev bcz FrontEndDev Extanded The Team Class. 
        System.out.println(fd.mNum);


    }
}
// Base Class OR Parent Class 
class Team{
    String name;
    int mNum;
    String color;
    String type;

    void getName(){
        System.out.println("Got My Name");
    }

}


//Derived Class OR Child Class OR Sub Class
class FrontEndDev extends Team{            //Single Level Inheritance
    String language;
    
    void getLang(){
        System.out.println("My Lang");
    }

}