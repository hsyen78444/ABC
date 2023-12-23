import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class saleEmployee {
    private final double basicSalary=1200;
    private double allowance;
    private double commission;
    private double bonus;
    private double saleEmployeeSalary;

    private ArrayList<Double> sale = new ArrayList<>();

    public ArrayList<Double> getSale(){
        return sale;
    }

    //calculation for commission
    public double calculateCommission(){
        for(Double i : sale){
            commission += i*0.01;
        }
        return commission;
    }

    //done
    public void haveAllowance(){
        Scanner k = new Scanner(System.in);

        System.out.print("Does the employee have allowance (Enter yes/no):");
        String input = k.next();

        if(input.equalsIgnoreCase("yes")){
            this.allowance = 250;
        }else{
            this.allowance = 0;
        }
    }

    //done
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

    //condition for within a month still missing
    public void bonus(){
        double totalSale = 0;
        for(Double i : sale){
            totalSale += i;
        }
        if(sale.size()>=15 || totalSale>=1000000){
            this.bonus = 500;
        }else{
            this.bonus = 0;
        }
    }

    public void saleSalary(){
        saleEmployeeSalary = basicSalary + allowance + calculateCommission()+bonus;
        System.out.println("Sale salary: "+saleEmployeeSalary);
    }
}
