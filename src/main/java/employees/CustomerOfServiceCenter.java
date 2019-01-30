package employees;


import job.ActionWithDevice;

public class CustomerOfServiceCenter extends Employee implements ActionWithDevice {

    private Object TicketOfServiceCenter;

    public CustomerOfServiceCenter(String workPlace, String position, String arrivalDate, String dateOfDismissal,
                                   double salary, String initials, String phone, String address) {
        super(workPlace, position, arrivalDate, dateOfDismissal, salary, initials, phone, address);
    }

       public void work() {
            payForRepairedDevice();

           }



    public void payForRepairedDevice() {

    }


    @Override
    public void takeDevice() {

    }

    @Override
    public void viewAllDevice() {


    }

    @Override
    public void giveDevice() {

    }

    @Override
    public void changeDevicePosition() {

    }
}
