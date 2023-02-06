import java.util.Scanner;

public class My48th_Array_Input_Output_delet {
    public static void main(String[] args){
        int marks[]=new int[10];

        Scanner sc=new Scanner(System.in);

        System.out.println("length of array "+ marks.length);


        System.out.print("Enter Marks Of Java:- ");

        marks[0]=sc.nextInt();                                        //input

        System.out.print("\nEnter Marks Of Python:- \n");

        marks[1]=sc.nextInt();                                       //input

        System.out.print("\nEnter Marks Of Maths:- ");

        marks[2]=sc.nextInt();                                       //input



        System.out.println("The Marks Of Java Is "+marks[0]);        //output
        System.out.println("The Marks Of Python Is "+marks[1]);      //output
        System.out.println("THe Marks Of Maths "+marks[2]);          //output
        System.out.println("THe Marks Of Anymous "+marks[3]);        //by default 0


        marks[2]=100;                                                //update
        System.out.println("THe Marks Of Maths "+marks[2]);

        marks[1]= marks[1]+1;                                      //update by adding +1
        System.out.println("The Marks Of Python Is "+marks[1]); 


        

        System.out.println("Total percentage of 3 subjects "+(marks[1]+marks[2]+marks[0])/3+"%");


        


sc.close();

    }
}
