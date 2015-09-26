package gomenko.j04;

/**
 * Created by Loner on 26.09.15.
 */
public class Multiply implements Operation{

    private int a;
    private int b;
    private int result;

    public Multiply(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int sum() {
        return 0;
    }

    @Override
    public int minus() {
        return 0;
    }

    @Override
    public int multiply() {
        return  result = a * b;
    }

    @Override
    public int extract() {
        return 0;
    }

    @Override
    public String toString() {
        return "" + result;
    }
}
