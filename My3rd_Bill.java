/*Question 3:Enter cost of 3 items from the user (using float datatype)-a pencil,a pen and an eraser. You 
have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

import java.util.*;

public class My3rd_Bill {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        

        System.out.println("Enter The Price Of Pencil:-");
        float pencil=sc.nextFloat();

        System.out.println("Enter Price Of Pen:-");
        float pen=sc.nextFloat();

        System.out.println("Enter Pricr of Eraser:-");
        float eraser=sc.nextFloat();


        float cost=(eraser+pen+pencil) * 0.18f;

        float sum=eraser+pen+pencil;


        System.out.println("The Total Cost Of Three Items Is:-"+(cost+sum));

    }
}
