package employees;

import serviceCenter.DeviceOfServiceCenter;

public class EngineerOfServiceCenter extends Employee{
    public EngineerOfServiceCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal, double salary, String initials, String phone, String address) {
        super(workPlace, position, arrivalDate, dateOfDismissal, salary, initials, phone, address);
    }

    private DeviceOfServiceCenter work(){
        return null;
    }
    private void chengeWarehouseOfDevice(){

    }
    private void changeStatusOfRepairTicket(){

    }
    private void viewAllCustomer(){

    }
    private void viewSalary(){

    }
    private double obtainSalary(){
        return 0;
    }

}
