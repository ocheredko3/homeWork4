package employees;

import job.ChangeDevicePosition;
import job.GiveDevice;
import job.TakeDevice;
import job.ViewAll;
import serviceCenter.DeviceOfServiceCenter;
import serviceCenter.TicketOfServiceCenter;

public class AdminOfServiceCenter extends Employee implements ChangeDevicePosition, ViewAll, TakeDevice, GiveDevice {

    public AdminOfServiceCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal,
                                double salary, String initials, String phone, String address) {
        super(workPlace, position, arrivalDate, dateOfDismissal, salary, initials, phone, address);
    }

    private void work() {
    }

    @Override
    public void giveDevice() {

    }

    @Override
    public void takeDevice() {

    }

    @Override
    public void viewAll() {

    }

    @Override
    public void changeDevicePosition() {

    }
}
