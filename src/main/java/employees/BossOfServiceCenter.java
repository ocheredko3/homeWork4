package employees;

import serviceCenter.ServiceCenter;

public class BossOfServiceCenter extends Employee {
    public BossOfServiceCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal, double salary, String initials, String phone, String address) {
        super(workPlace, position, arrivalDate, dateOfDismissal, salary, initials, phone, address);
    }

    private void officeRent(){
        ServiceCenter serviceCenterKiev = new ServiceCenter(703,"+38(044)567-89-01",
                "Kiev,Pobedy 76","понеділок-пятниця з 10 -19");

    }
    private void fireAnEmployee(){

    }
    private void hireAnEmployee(){
        Employee Ivanov = new AdminOfServiceCenter("703","Administrator","27.01.2019","",
                                                    4030.50,"Ivanov Ivan","+38(093)93-93939","Kiev,Kurbasa 9 kv.50");
        Employee Petrov = new EngineerOfServiceCenter("703","Engineer","27.01.2019","",
                4030.5,"Petrov Petro","+38(063063-63-636","Kiev,Pravdy av. 55,kv.78");

    }
    private String viewAllEmployee(){
    return null;
    }
    private void viewAllincome(){

    }
    private void payTax(){

    }
    private void paySalary(){

    }
    private void  increaseSalary(){

    }
    private double obtainSalary(){
        return 0;
    }

}
