public class Day7_conditionals {
    public static void main(String[] args) {

        // ? if and if-else Conditonal -----------
        int a = 23, b = 12;

        if (a > b) {
            System.out.println("greater 1");
        }

        if (a > b)
            System.out.println("greater 2"); // short hand 1 for if

        System.out.println("------------------------------------");
        // ? ternary operator
        System.out.println(a > b ? "greater 3 " : "small");
        ;// short hand 2 for if

        System.out.println("------------------------------------");
        // ? Switch
        int day = 5;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }

    }
}
