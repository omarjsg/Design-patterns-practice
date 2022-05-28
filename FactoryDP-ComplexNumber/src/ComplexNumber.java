public abstract class ComplexNumber {
    int a, b;
    public ComplexNumber(int a, int b){
        setA(a);
        setB(b);
        System.out.printf("The complex number generated is : %d%+di.%n", a, b);
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}
