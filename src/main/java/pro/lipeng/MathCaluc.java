package pro.lipeng;

public class MathCaluc {
    public static void main(String[] args) {
        int j = js(20, 3, "-");
        System.out.println(j);
    }

    public static int js(int a, int b, String s) {
        int sum = 0;


        switch (s) {
            case "+":
                sum = a + b;
                break;
            case "-":
                sum = a - b;
                break;
            case "*":
                sum = a * b;
                break;
            case "/":
                sum = a / b;
                break;

        }

        return sum;
    }


}
