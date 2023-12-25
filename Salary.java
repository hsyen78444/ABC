import java.util.Scanner;

public class Salary{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.print("Enter 1 to get sale employee salary \nEnter 2 to get management salary \nEnter your choice:");
        int choice = k.nextInt();
        System.out.println();
        
        switch (choice) {
            case 1:
                getSaleEmployeeSalary();
                break;
            case 2 :
                getManagementEmplyoyeeSalary();
                break;
            default:
                System.out.println("Enter a valid choice.");
                break;
        }
    }

    public static void getSaleEmployeeSalary(){
        Scanner k = new Scanner(System.in);
        saleEmployee s = new saleEmployee();

        System.out.print("Enter 1 to type in sale \nEnter 2 to import sale \nEnter your choice: ");
        int choice = k.nextInt();
        System.out.println();

        switch (choice) {
            case 1 :
                s.addSale();
                break;
            case 2 :
                s.importSale();
                break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }
        System.out.println();
        s.haveAllowance();
        System.out.println();
        s.saleSalary();
    }

    public static void getManagementEmplyoyeeSalary(){
        Scanner k = new Scanner(System.in);
        managementEmployee m = new managementEmployee();

        System.out.print("Enter 1 to type in sale \nEnter 2 to import sale \nEnter your choice: ");
        int choice = k.nextInt();
        System.out.println();

        switch (choice) {
            case 1 :
                m.addSale();
                break;
            case 2 :
                m.importSale();
                break;
            default:
                System.out.println("Enter a valid choice");
                break;
        }
        System.out.println();

        m.haveAllowance();
        System.out.println();
        
        m.employeeSalary();
    }

    
    

    

    
}
