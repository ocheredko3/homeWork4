package employees;

import serviceCenter.DeviceOfServiceCenter;
import serviceCenter.TicketOfServiceCenter;

public class CustomerOfServiceCenter extends Employee{

    public CustomerOfServiceCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal,
                                   double salary, String initials, String phone, String address) {
        super(workPlace, position, arrivalDate, dateOfDismissal, salary, initials, phone, address);
    }
    private DeviceOfServiceCenter giveDeviceToRepair(TicketOfServiceCenter ticket){
        return null;
    }
    private TicketOfServiceCenter takeRepairedDeviceOfCerviceCenter(DeviceOfServiceCenter device){
        return null;
   }
   private void payForReparedDevice(DeviceOfServiceCenter device){

   }
   private void callToServiceCenter(){

   }
    private double obtainSalary(){
        return 0;
    }
}
