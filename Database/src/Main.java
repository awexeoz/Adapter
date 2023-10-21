import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Database database = new AdapterJavaToDatabase();

        System.out.println("Что вы хотите сделать?");
        System.out.println("1.Insert");
        System.out.println("2.Update");
        System.out.println("3.Select");
        System.out.println("4.Remove");

        int ch = sc.nextInt();

        switch(ch){
            case 1:
                database.insert();
                break;
            case 2:
                database.update();
                break;
            case 3:
                database.select();
                break;
            case 4:
                database.remove();
                break;
            default:
                System.out.println("Неверный выбор");
                System.exit(0);
        }
    }
}