public class My107_oops {
    public static void main(String [] args){
        Pen p1=new Pen(); //created pen object called p1 //objects going to store in heap memory
        p1.setColor("red");
        System.out.println(p1.color); // so for accesing Any propertey of object we use DOT OPERATOR(.) .


        p1.setPrice(90);
        int pricee=p1.price;
        System.out.println(pricee);

        //we can directly also set the price , color without using function...
        p1.color="yellow";
        System.out.println(p1.color);
    }
}

class Pen{
    //Propertey + Function
    int price;
    String color;

    void setPrice(int newPrice){
        price=newPrice;
    }

    void setColor(String newColor){
        color=newColor;
    }
  
}

class Student{
    int eNo;
    int age;
    String name;
    float percentage;

    void getPercent(int java,int daa,int os,int cn,int psnm){
        percentage=(java+daa+os+cn+psnm)/5;
    }


}
