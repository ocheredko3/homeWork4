package employees;

import serviceCenter.DeviceOfServiceCenter;
import serviceCenter.TicketOfServiceCenter;

public class AdminOfServiceCenter extends Employee{

    public AdminOfServiceCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal,
                                double salary, String initials, String phone, String address) {
        super(workPlace, position, arrivalDate, dateOfDismissal, salary, initials, phone, address);
    }

    private TicketOfServiceCenter work(CustomerOfServiceCenter customer , DeviceOfServiceCenter device){
        return null;
    }
    private DeviceOfServiceCenter returnDeviceToCustomer(TicketOfServiceCenter tiket){
        return null;

    }
    private void changeWarehouseOfDevice (){

    }
    private void viewAllCustomer(){

    }
    private void changeStatusOfRepairTicket(){

    }
    private void changeEngineerOfRepairTicket(){

    }
    private double obtainSalary(){
        return 0;
    }

}
