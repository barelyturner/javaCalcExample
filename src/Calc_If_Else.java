
public class Calc_If_Else {
    static void calc(double a, double b, char operation) {
        if (operation == '+'){
            System.out.println(a + b);
        } else if (operation == '-'){
            System.out.println(a - b);
        } else if (operation == '/'){
            System.out.println(a / b);
        } else if (operation == '*'){
            System.out.println(a * b);
        } else {
            System.out.println("Error: Incorrect operation");
        }
    }

    public static void main(String[] args) {
        calc(5, 1,'+');
    }
}




