public class ComplexNumberFactory {

    public ComplexNumberFactory(){

    }
    public ComplexNumber createComplexNumber(int a, int b, String type){
        ComplexNumber cn = null;
        if (type.equals("polar")){
            cn = new PolarForm(a, b);
        } else if (type.equals("vector")){
            cn = new VectorForm(a, b);
        } else {
            System.out.println(Color.ANSI_RED + "Error: the type selected cannot be initiated, please add this type to the factory." + Color.ANSI_RESET);
        }
        return cn;
    }
}
