package gomenko.j04;

/**
 * Created by Loner on 26.09.15.
 */
public class Launch {

    public static final String PLUS = "+";
    public static final String MINUS = "-";
    public static final String EXTRACT = "/";
    public static final String MULTIPLY = "*";

    public static void main(String[] args) {

        if (args.length == 3) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[2]);

            switch (args[1]) {

                case PLUS:
                    System.out.println(new Plus(a, b));
                    break;

                case MINUS:
                    System.out.println(new Minus(a, b));
                    break;

                case EXTRACT:
                    System.out.println(new Extract(a, b));
                    break;

                case MULTIPLY:
                    System.out.println(new Multiply(a, b));
                    break;
            }
        }
    }
}
