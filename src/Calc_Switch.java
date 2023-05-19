public class Calc_Switch {

    public static void main(String[] args) {
        calc(7, 5, '/');
    }

    static void calc(double a, double b, char operation){
        switch (operation) {
            case '+':
                System.out.println (a + b);
                break;
            case '-':
                System.out.println (a - b);
                break;
            case '/':
                System.out.println (a / b);
                break;
            case '*':
                System.out.println (a * b);
                break;
            default:
                System.out.println ("Error: Incorrect operation");
        }

    }
}
