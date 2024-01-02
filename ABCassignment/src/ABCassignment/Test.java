/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ABCassignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String []selection=new String[4];
        System.out.println("Enter 1 for importing data customer/employee/sales/vehicle, 0 for no (four circle required):");
        for(int i=0;i<4;i++)
        selection[i]=scanner.next();
        Customer [] c= importCustomer(selection[0]);
        Employee [] e=importEmployee(selection[1]);
        Sales [] s=importSales(selection[2]);
        Vehicle []v=importVehicle(selection[3]);      
        addManagement(selection[1]);
        //filterForSalesLevel(c,s);
        //System.out.println(v[30].getCarModel());
        //filterForManagementLevel(c,e,s,v);
        System.out.print(c[3].getCustId());
    }
        public static Customer []importCustomer(String selc){
            Customer []c=new Customer[9999];
            if(selc.equals("1")){
            try{
            Scanner sc=new Scanner(new FileInputStream("cust.csv"));
            int i=0;
            while(sc.hasNextLine()){
                String [] cust=sc.nextLine().split(",");
                c[i]=new Customer(cust[0],cust[1],cust[2],cust[3]);
                i++;
            }
            sc.close();
            }
            catch(FileNotFoundException e){
            System.out.printf("ERROR - A %s occurred:\n%s\n",e.getClass().toString(),e.getMessage());
            }
            }
            return c;
    }
    public static Employee[] importEmployee(String selc){
        Employee [] e=new Employee[9999];
        if(selc.equals("1")){
        try{
            Scanner sc=new Scanner(new FileInputStream("employee.csv"));
            int i=0;
            while(sc.hasNextLine()){
                String [] emp=sc.nextLine().split(",");
                e[i]=new Employee(emp[0],emp[1],emp[2],emp[3]);
                i++;
            }
            sc.close();
        }
        catch(FileNotFoundException fe){
            System.out.printf("ERROR - A %s occurred:\n%s\n",fe.getClass().toString(),fe.getMessage());
        }
        }
        return e;
    }
    public static Sales[] importSales(String selc){
        Sales [] s=new Sales[9999];
        if(selc.equals("1")){
        try{
            Scanner sc=new Scanner(new FileInputStream("sales.csv"));
            int i=0;
            while(sc.hasNextLine()){
                String [] sale=sc.nextLine().split(",");
                s[i]=new Sales(sale[0],sale[1],sale[2],sale[3],sale[4]);
                i++;
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.printf("ERROR - A %s occurred:\n%s\n",e.getClass().toString(),e.getMessage());
        }
        }
        return s;
    }
    public static Vehicle[] importVehicle(String selc){
        Vehicle [] v=new Vehicle[10000];
        if(selc.equals("1")){
        try{
            Scanner sc=new Scanner(new FileInputStream("vehicle.csv"));
            int i=0;
            while(sc.hasNextLine()){
                String [] vech=sc.nextLine().split(",");
                if(vech[3].equals("0"))
                    v[i]=new Vehicle(vech[0],vech[1],vech[2],vech[3],vech[4]);
                else if(vech[3].equals("1"))
                    v[i]=new Vehicle(vech[0],vech[1],vech[2],vech[3],null);
                i++;
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.printf("ERROR - A %s occurred:\n%s\n",e.getClass().toString(),e.getMessage());
        }
        }
        return v;
    }
    public static String passwordGenerator(){
         String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String lower="abcdefghijklmnopqrstuvwxyz";
         String specialChars="<>.?/{}[]+-_()-*&^%$#@!";
         String num="0123456789";
         String combination=upper+lower+specialChars+num;
         char [] password=new char [8];
         Random r=new Random();
         for (int i=0;i<8;i++){
            password[i]=combination.charAt(r.nextInt(combination.length()));
         }
         return new String (password);
    }
    public static void addManagement(String selc){
        if(selc.equals("1")){
        StringBuilder sb=new StringBuilder();
            if (Employee.record<10){
               sb.append("E000"+Integer.toString(Employee.record));
            }
            else if(Employee.record<100){
               sb.append("E00"+Integer.toString(Employee.record));
            }
            else if(Employee.record<1000){
               sb.append("E0"+Integer.toString(Employee.record));
            }
            else{
               sb.append("E"+Integer.toString(Employee.record));
            }
            Scanner in=new Scanner(System.in);
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter name : ");
            String name=in.nextLine();
            System.out.println("Please set the employee status (0 for sales level and 1 for management level ) : ");
            int status=scanner.nextInt();
            String pass =passwordGenerator();
            sb.append(","+name+","+status+","+pass);
            try{
                PrintWriter pw=new PrintWriter(new FileOutputStream("employee.csv",true));
                pw.println(sb.toString());
                pw.close();
                System.out.println("Done");
            }
            catch(IOException ioe){
                System.out.printf("ERROR - A %s occurred:\n%s\n",ioe.getClass().toString(),ioe.getMessage());
            }  
            importEmployee(selc);
        }
        else{
            System.out.print("Please import employee data");
        }
        }
    public static void filterForSalesLevel (Customer[] c,Sales[] s){
        Scanner scanner=new Scanner(System.in);
        String search="";
        String search2="";
        System.out.print("Search : ");
        search=scanner.next();
        if(search.charAt(4)=='-'){
                System.out.print("date until : (enter same date if date range are not needed) ");
                search2=scanner.next();
        }
        if(search.charAt(4)=='-'){
        for (int i=0;i<Sales.record;i++){
            if(s[i].getDateTime().compareTo(search)>=0&&s[i].getDateTime().compareTo(search2)<=0)
            System.out.println(s[i].getAll());
        }
        }
        for (int i=0;i<Sales.record;i++){
            if((s[i].getCustId()).equals(search)||(s[i].getSalesId()).equals(search)||(s[i].getEmployeeId()).equals(search)
                ||(s[i].getCarPlate()).equals(search))
            System.out.println(s[i].getAll());
        }
        for(int i=0;i<Customer.record;i++){
            if((c[i].getCustId()).equals(search)||(c[i].getCustName()).equals(search)||(c[i].getPostcode()).equals(search)||
                    (c[i].getPhoneNum()).equals(search))
            System.out.println(c[i].getAll());
        }     
        }
    public static void filterForManagementLevel (Customer[] c,Employee[]e,Sales[] s,Vehicle[] v){
        Scanner scanner=new Scanner(System.in);
        String search="";
        String search2="";
        System.out.println("Use >=,<= to find amount");
        System.out.print("Search : ");
        search=scanner.next();
        if(search.charAt(0)=='>'||search.charAt(0)=='<'){
                System.out.print("amount to : (enter same amount if date range are not needed) ");
                search2=scanner.next();
        }
        else if(search.charAt(4)=='-'){
                System.out.print("date until : (enter same date if date range are not needed) ");
                search2=scanner.next();
        }
        if(search.charAt(0)=='>'||search.charAt(0)=='<'){
            search=search.replaceAll("[><=]","");
        for(int i=1;i<Vehicle.record;i++){
            if(Integer.parseInt(v[i].getAcquirePrice())>=Integer.parseInt(search))
                    System.out.println(v[i].getAll());       
            else if(search.charAt(0)=='<'){
                if(Integer.parseInt(v[i].getAcquirePrice())<=Integer.parseInt(search))
                    System.out.println(v[i].getAll());
            }  
        }
        }
        else if(search.charAt(4)=='-'){
        for (int i=0;i<Sales.record;i++){
            if(s[i].getDateTime().compareTo(search)>=0&&s[i].getDateTime().compareTo(search2)<=0)
            System.out.println(s[i].getAll());
        }
        }
        for(int i=1;i<Vehicle.record;i++){
        if((v[i].getCarPlate()).equals(search)||(v[i].getCarModel()).equals(search)||(v[i].getCarStatus()).equals(search))
            System.out.println(v[i].getAll());
        }
        for (int i=0;i<Sales.record;i++){
            if((s[i].getEmployeeId()).equals(search)||(s[i].getSalesId()).equals(search)||(s[i].getEmployeeId()).equals(search)
                ||(s[i].getCarPlate()).equals(search))
            System.out.println(s[i].getAll());
        }
        for(int i=0;i<Customer.record;i++){
            if((c[i].getCustId()).equals(search)||(c[i].getCustName()).equals(search)||(c[i].getPostcode()).equals(search)||
                    (c[i].getPhoneNum()).equals(search))
            System.out.println(c[i].getAll());
        }     
        for(int i=0;i<Employee.record;i++){
            if((e[i].getEmployeeId()).equals(search)||(e[i].getEmployeeName()).equals(search)||(e[i].getPassword()).equals(search)||
                    (e[i].getEmployeeStatus()).equals(search))
            System.out.println(e[i].getAll());
        }     
        }
    public static void testsee(){
        importEmployee("");
}
}
    

