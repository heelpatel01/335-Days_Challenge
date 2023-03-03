public class My108_AccesModifiers {
    public static void main(String[] args){

        UserInfo inf=new UserInfo();
        inf.name="heel";
        System.out.println(inf.name);
        // inf.pass="patel";  Can't acces pass var. bcz it is private
        inf.setPass("patel");
        // System.out.println(inf.pass); //it will not work bcz pass is private //We Can Just Modify or change it but can't access it.
        
        
    }   
}

class UserInfo{
    public String name;
    private String pass;
    
    
    public void setPass(String pwd){
        pass=pwd;
    }
}