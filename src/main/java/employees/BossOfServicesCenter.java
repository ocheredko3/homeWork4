package employees;

import job.Accountant;
import job.AdministrationServices;
import job.HumanResources;

public class BossOfServicesCenter extends Employee implements Accountant, AdministrationServices, HumanResources {
    public BossOfServicesCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal, double salary, String initials, String phone, String address) {
        super(workPlace, position, arrivalDate, dateOfDismissal, salary, initials, phone, address);
    }

    public void work() {
    }



    @Override
    public void viewAllIncome() {

    }

    @Override
    public void payTax() {

    }

    @Override
    public void paySalary() {

    }

    @Override
    public void increaseSalary() {
        setSalary(getSalary()*0.1);

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
