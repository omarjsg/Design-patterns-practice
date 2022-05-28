public class VectorForm extends ComplexNumber {
    private int x, y;
    public VectorForm(int a, int b) {
        super(a, b);
        setX(a);
        setY(b);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Vector form (x, y): (%d, %d).", x, y);
    }
}
