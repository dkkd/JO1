package gomenko.j04;

/**
 * Created by Loner on 26.09.15.
 */
public class Extract implements Operation {

    private int a;
    private int b;
    private int result;

    public Extract(int a, int b) {
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
        return 0;
    }

    @Override
    public int extract() {
        return result = a / b;
    }

    @Override
    public String toString() {
        return "" + result;
    }
}
