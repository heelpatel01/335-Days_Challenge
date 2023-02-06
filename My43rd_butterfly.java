public class My43rd_butterfly {

    public static void butterfly(int lines){
        //1st half
        for(int h1=1;h1<=lines;h1++){

            //star 1:- i th.
            for(int star1=1;star1<=h1;star1++){
                System.out.print("*");
            }
            //space:- 2 × (lines-current line)
            for(int space=1;space<=2*(lines-h1);space++){
                System.out.print(" ");
            }
            //star 2:- i th
            for(int star2=1;star2<=h1;star2++){
                System.out.print("*");
            }
            System.out.println();

        }

        //2nd half
        for(int h2=lines;h2>=1;h2--){
            
            //star1 :- i th
            for(int star1=1;star1<=h2;star1++){
                System.out.print("*");
            }
            //spaces :- 2 × (lines-h2)
            for(int space=1;space<=2*(lines-h2);space++){
                System.out.print(" ");
            }
            //star2 :- i th
            for(int star2=1;star2<=h2;star2++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        butterfly(4);

    }    
}
