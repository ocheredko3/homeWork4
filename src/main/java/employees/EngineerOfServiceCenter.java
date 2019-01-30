package employees;

import job.ChangeDevicePosition;
import job.GiveDevice;
import job.TakeDevice;
import job.ViewAll;

public class EngineerOfServiceCenter extends Employee implements TakeDevice, ViewAll, GiveDevice, ChangeDevicePosition {
    public EngineerOfServiceCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal, double salary, String initials, String phone, String address) {
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

    @Override
    public void viewAll() {

    }
}
