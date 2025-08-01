public class Day5_operators {
    public static void main(String[] args) {
        System.out.println((2 > 2) || (4>2));
        
        int a = 1;
        int b = 2;

        // arithmatic operators
        System.out.println("arithmatic"); 
        System.out.println(a+b); // add
        System.out.println(a-b); // sub
        System.out.println(a*b); // multi
        System.out.println(a/b); // div
        System.out.println(a%b); // modulo
        
        // unary 
        System.out.println("Unary : --------"); 
        System.out.println(a+ "-> a++ : " + a++);   // post-increment
        System.out.println(a+ "-> ++a : " + (++a)); // pre-increment

        // assignment
        System.out.println("Assignment : --------"); 
        System.out.println(a=b);        
        System.out.println(a+=b);        
        System.out.println(a-=b);        
        System.out.println(a*=b);        
        System.out.println(a/=b);        

        // comparision 
        System.out.println("comparision (bool) ---------------");
        a = 20;
        System.out.println("a : "+a +" b: "+b);
        System.out.println(a==b);        
        System.out.println(a<=b);        
        System.out.println(a>=b);        
        System.out.println(a!=b);        
        
        // logical (works on the bool only)
        System.out.println("Logical ---------------");
        System.out.println(a>b || b>a);
        System.out.println(a>b && !(b>a));

        // bitwise 
        System.out.println("bitwise --------------");
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~a);

    }
}
