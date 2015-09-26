package gomenko.j04;

/**
 * Created by Loner on 26.09.15.
 */
public class Plus implements Operation {

    private int a;
    private int b;
    private int result;

    public Plus(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int sum() {
        return result = a + b;
    }

    @Override
    public int minus() {
        return 0;
    }

    @Override
    public int multiply() {
        return 0;
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
