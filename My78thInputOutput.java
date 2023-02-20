//how to take inputs and give output:-

import java.util.*;

import java.util.*;

public class My78thInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Way-1
        System.out.println("Enter Your Name Only");
        String name = sc.next(); // it will take only single word as an input...for multiple words used :: "nextLine"
        sc.nextLine(); // consume the rest of the line
        System.out.println("Hi, " + name);

        // Way-2
        System.out.print("Enter Your Full Name: ");
        String name1 = sc.nextLine();
        System.out.println("Nice to meet you " + name1 + " ❤");

        sc.close();
    }
}
