import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        Controller controller = Controller.getInstances();
        do {
            try {
                System.out.println(Color.ANSI_YELLOW + "############################### Main menu ###############################" + Color.ANSI_RESET);
                System.out.println(Color.ANSI_BLUE+ "Kindly enter the number of the option:"+ Color.ANSI_RESET + "\n1- Create a complex number in Polar form.\n2- Create a complex number in Vector form.\n3- Exit.");
                choice = scanner.nextInt();
                switch (choice){
                    case 1 -> {
                        System.out.println(Color.ANSI_YELLOW + "################ Create a complex number in polar form #################" + Color.ANSI_RESET);
                        System.out.println(Color.ANSI_PURPLE+ "Enter the value of a: "+ Color.ANSI_RESET);
                        int a = scanner.nextInt();
                        System.out.println(Color.ANSI_PURPLE+ "Enter the value of b: "+ Color.ANSI_RESET);
                        int b = scanner.nextInt();
                        System.out.println(controller.generateCN(a, b, "polar"));
                        break;
                    }
                    case 2 -> {
                        System.out.println(Color.ANSI_YELLOW + "################ Create a complex number in vector form #################" + Color.ANSI_RESET);
                        System.out.println(Color.ANSI_PURPLE+ "Enter the value of a: "+ Color.ANSI_RESET);
                        int a = scanner.nextInt();
                        System.out.println(Color.ANSI_PURPLE+ "Enter the value of b: "+ Color.ANSI_RESET);
                        int b = scanner.nextInt();
                        System.out.println(controller.generateCN(a, b, "vector"));
                        break;
                    }
                    case 3 -> {
                        System.out.println("Exit . . .");
                        System.exit(0);
                    }
                    default -> {
                        System.out.println(Color.ANSI_RED + "\u2757 Wrong choice." + Color.ANSI_RESET);
                        break;
                    }
                }

            } catch (InputMismatchException e){
                scanner.nextLine();
                System.out.println(Color.ANSI_RED + "\u2757 Error: invalid input type." + Color.ANSI_RESET);
            } catch (IllegalArgumentException e){
                System.out.println(Color.ANSI_RED + e + Color.ANSI_RESET);
            }

        }while (choice != 3);
    }
}
