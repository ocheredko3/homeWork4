package employees;

import job.Accountant;
import job.AdministrationService;
import job.HumanResources;
import job.TakeDevice;

public class BossOfServiceCenter extends Employee implements Accountant, AdministrationService, HumanResources {
    public BossOfServiceCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal, double salary, String initials, String phone, String address) {
        super(workPlace, position, arrivalDate, dateOfDismissal, salary, initials, phone, address);
    }

    private void work() {
    }

    @Override
    public void accountant() {

    }

    @Override
    public void viewAllincome() {

    }

    @Override
    public void payTax() {

    }

    @Override
    public void paySalary() {

    }

    @Override
    public void increaseSalary() {

    }

    @Override
    public void officeRent() {

    }

    @Override
    public void setIdServiceCenter() {

    }

    @Override
    public void setContactOfServiceCenter() {

    }

    @Override
    public void setAddressOfServiceCenter() {

    }

    @Override
    public void setWorkTimeOfServiceCenter() {

    }

    @Override
    public void hireAnEmployee() {

    }

    @Override
    public void viewAllEmployee() {

    }

    @Override
    public void fireAnEmployee() {

    }
}
