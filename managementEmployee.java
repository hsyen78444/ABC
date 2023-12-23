import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class managementEmployee {
    private final double basicSalary=2200;
    private double allowance;
    private double commission;
    private double commissionRate;
    private double totalSale = 0;
    private double managementsalary;

    private ArrayList<Double> sale = new ArrayList<>();

    public ArrayList<Double> getSale(){
        return sale; 
    }

    public void addSale(){
        Scanner k = new Scanner(System.in);

        boolean running = true;
        while(running){
            System.out.println("Enter sale (-1 to quit): ");
            double input = k.nextDouble();
            if(input != -1){
                sale.add(input);
            }else{
                running = false;
            }
        }
    }

    public void importSale(){
        Scanner k = new Scanner(System.in);

        System.out.print("Enter file input:");
        String input = k.nextLine();
        
        try{   
            Scanner in = new Scanner(new FileInputStream(input));
            
            while(in.hasNext()){
                String line = in.nextLine();
                double num = Double.parseDouble(line);
                sale.add(num);
            }
            
            System.out.println("data import succesfull!");
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }

    public double calculateCommission(){
        for(Double i : sale){
            commission += commissionRate*0.01;
        }
        return commission;
    }

    public void calculateCommissionRate(){
        for(Double i : sale){
            totalSale += i;
        }
        if(totalSale<=800000.00){
            commissionRate = 1.0;
        }else if(totalSale>=800000.01 && totalSale<= 1600000.00){
            commissionRate = 1.15;
        }else if(totalSale>=1600000.01 && totalSale<=2500000.00){
            commissionRate = 1.25;
        }else if(totalSale>=2500000.01){
            commissionRate = 1.35;
        }
    }

    public void haveAllowance(){
        Scanner k = new Scanner(System.in);

        System.out.print("Does the employee have allowance (Enter yes/no):");
        String input = k.next();

        if(input.equalsIgnoreCase("yes")){
            this.allowance = 350;
        }else{
            this.allowance = 0;
        }
    }

    public void employeeSalary(){
        managementsalary = basicSalary + allowance + calculateCommission();
        System.out.println("Managemen salary: "+managementsalary);
    }

    
    
}