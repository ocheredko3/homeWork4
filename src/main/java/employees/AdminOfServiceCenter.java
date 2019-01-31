package employees;

import job.ActionWithDevice;
import serviceCenter.DeviceOfServiceCenter;
import serviceCenter.TicketOfServiceCenter;


public class AdminOfServiceCenter extends Employee implements ActionWithDevice {

    public AdminOfServiceCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal,
                                double salary, String initials, String phone, String address) {
        super(workPlace, position, arrivalDate, dateOfDismissal, salary, initials, phone, address);
    }
    TicketOfServiceCenter ticketOfServiceCenter = new TicketOfServiceCenter("","","","" +
            "","","","",0);
    CustomerOfServiceCenter customerOfServiceCenter = new CustomerOfServiceCenter("","","","",0,
            "","","");
    public void work() {
    }

    @Override
    public void giveDevice() {
        this.ticketOfServiceCenter.setDateOfIncomeDevice("");
        this.ticketOfServiceCenter.getPriceOfRepair();


    }

    @Override
    public void takeDevice() {
        this.ticketOfServiceCenter.setAdminOfServiceCenter("");
        this.ticketOfServiceCenter.setCustomerOfServiceCenter("");
        this.ticketOfServiceCenter.setPriceOfRepair(0);
        this.ticketOfServiceCenter.setDateOfIncomeDevice("");
        this.ticketOfServiceCenter.setEngineerOfServiceCenter("");
        this.ticketOfServiceCenter.setTicketID("");
        this.ticketOfServiceCenter.setDeviceOfServiceCenter("");

    }

    @Override
    public void viewAllDevice() {


    }

    @Override
    public void changeDevicePosition() {

    }
}
