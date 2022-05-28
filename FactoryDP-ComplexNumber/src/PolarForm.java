public class PolarForm extends ComplexNumber {
    double r, theta;
    public PolarForm(int a, int b){
        super(a, b);
        setR(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        setTheta(checkTheta(a, b));
    }

    // check if theta is valid.
    private double checkTheta(int a, int b){
        if(a == 0 && b == 0){
            throw new IllegalArgumentException("\u2757 Theta cannot be decided since the coordinates give a point.");
        }
        double theta = Math.atan2(b, a) * (180/Math.PI);
        return theta < 0? theta + 360: theta;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getTheta() {
        return theta;
    }

    public void setTheta(double theta) {
        this.theta = theta;
    }

    @Override
    public String toString() {
        return String.format("Polar form (r, \u03B8): (%.2f, %.2f).", r, theta);
    }
}
