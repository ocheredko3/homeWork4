package employees;

import job.ChangeDevicePosition;
import job.GiveDevice;
import job.TakeDevice;
import serviceCenter.DeviceOfServiceCenter;
import serviceCenter.TicketOfServiceCenter;

public class CustomerOfServiceCenter extends Employee implements TakeDevice, GiveDevice, ChangeDevicePosition {

    public CustomerOfServiceCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal,
                                   double salary, String initials, String phone, String address) {
        super(workPlace, position, arrivalDate, dateOfDismissal, salary, initials, phone, address);
    }


    private void work() {

    }

    @Override
    public void changeDevicePosition() {

    }

    @Override
    public void giveDevice() {

    }

    @Override
    public void takeDevice() {

    }
}
