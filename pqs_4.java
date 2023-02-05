// Search about(Google) & use the following methods of the Math class in Java:
// a.Math.min( )
// b.Math.max( )
// c.Math.sqrt( )
// d.Math.pow( )
// e.Math.avg( )
// f.Math.abs( )
// Free reading resource (https://www.javatpoint.com/java-math)Please feel free to look for more resources/websites on your own.

public class pqs_4 {
    public static void main(String[] args){

        int a=123;

        int b=101;

        int c=901;

        int d=355;


        int minimum= Math.min(a,b);

        int maximum=Math.max(b, d);

        int sqrt= (int) Math.sqrt(d);

        System.out.println("The Minimum Number From "+a+" and "+b+" is "+minimum+" and maximum is "+maximum+" And The Square Root Of "+d+" is "+sqrt);

        int power=(int)Math.pow(d,2);

        System.out.println("101 to the power 2 is "+power);

        int absolute=Math.abs(c);

        System.out.println("Absolute Value Of "+ c +" is "+absolute);
    }
}
