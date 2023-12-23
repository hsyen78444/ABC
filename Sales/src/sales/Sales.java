
package sales;


public class Sales {


    public static void main(String[] args) {
        System.out.println("=== Inputting Customer Data ===");
        InputCustomerData.main(args);

        System.out.println("\n=== Inputting Sales Data ===");
        InputSalesData.main(args);
        
        System.out.println("\n=== Inputting Vehicle Data ===");
        InputVehicleData.main(args);
    }
    
}
