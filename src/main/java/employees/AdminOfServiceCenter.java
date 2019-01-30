package employees;

import job.ActionWithDevice;


public class AdminOfServiceCenter extends Employee implements ActionWithDevice {

    public AdminOfServiceCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal,
                                double salary, String initials, String phone, String address) {
        super(workPlace, position, arrivalDate, dateOfDismissal, salary, initials, phone, address);
    }

    public void work() {
    }

    @Override
    public void giveDevice() {

    }

    @Override
    public void takeDevice() {

    }

    @Override
    public void viewAllDevice() {


    }

    @Override
    public void changeDevicePosition() {

    }
}
