public class My109_SetGetThis {

    public static void main(String args[]){
        
    }
    
}

class GetSetThis{
    String name;
    String color;                     //this one ....👍🏼
    int num;

    void setName(String newName){
        name=newName;
    }

    void setColor(String color){
        this.color=color;             //this.color means the propertey of this class.👍🏼
    }

    void getNum(int num){
        this.num=num;
    }

    String getName(){
        return this.name;
    }

    String getColor(){
        return this.color;
    }

    int getNum(){
        return this.num;
    }
}
