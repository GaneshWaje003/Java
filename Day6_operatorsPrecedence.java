public class Day6_operatorsPrecedence {
    public static void main(String[] args) {

        // operators precedence :- operators and are applied and evaluated based on
        // precedence.


        // left to right evaluation is done in case of the same precedence called as associativity


        System.out.println("--------------------------");
        System.out.println(1 * 4 + 2);
        System.out.println(1 + 4 * 2);
        System.out.println(1 * 4 / 2);

        System.out.println("--------------------------");
        System.out.println("using parenthesis for ");

        System.out.println("--------------------------");
        int a = 10, b = 5, c = 1;
        int result = a - ++c - ++b;
        System.out.println(result);
        System.out.println("--------------------------");
        System.out.println(a++ * b * c);
        
        
        System.out.println("--------------------------");
        a = b = c = 10; // Evaluated as a = (b = (c = 10))
        // int res = (5 + 2 * 3 > 10) && (4 < 6);
        int res = 8 + 4 << 1;  // Shift has lower precedence than addition
        System.out.println(res);

    }
}
