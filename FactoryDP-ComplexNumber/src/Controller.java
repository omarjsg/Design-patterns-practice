public class Controller {
    private static Controller controller;
    private ComplexNumberFactory factory = new ComplexNumberFactory();

    private Controller() {

    }

    public static synchronized Controller getInstances(){
        if (controller == null){
            controller = new Controller();
        }
        return controller;
    }

    public String generateCN(int a, int b, String type){
        ComplexNumber cn = factory.createComplexNumber(a, b, type);
        return cn + "\n";
    }

}
