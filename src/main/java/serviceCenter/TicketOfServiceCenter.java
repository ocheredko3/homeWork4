package serviceCenter;

import java.util.ArrayList;
import java.util.List;

public class TicketOfServiceCenter {

    String ticketID;
    String adminOfServiceCenter;
    String engineerOfServiceCenter;
    String customerOfServiceCenter;
    String dateOfIncomeDevice;
    String dateOfOutDevice;
    String deviceOfServiceCenter;
    double priceOfRepair;

    public TicketOfServiceCenter(String ticketID, String adminOfServiceCenter, String engineerOfServiceCenter, String customerOfServiceCenter,
                                 String dateOfIncomeDevice, String dateOfOutDevice, String deviceOfServiceCenter, double priceOfRepair) {
        this.ticketID = ticketID;
        this.adminOfServiceCenter = adminOfServiceCenter;
        this.engineerOfServiceCenter = engineerOfServiceCenter;
        this.customerOfServiceCenter = customerOfServiceCenter;
        this.dateOfIncomeDevice = dateOfIncomeDevice;
        this.dateOfOutDevice = dateOfOutDevice;
        this.deviceOfServiceCenter = deviceOfServiceCenter;
        this.priceOfRepair = priceOfRepair;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public String getAdminOfServiceCenter() {
        return adminOfServiceCenter;
    }

    public void setAdminOfServiceCenter(String adminOfServiceCenter) {
        this.adminOfServiceCenter = adminOfServiceCenter;
    }

    public String getEngineerOfServiceCenter() {
        return engineerOfServiceCenter;
    }

    public void setEngineerOfServiceCenter(String engineerOfServiceCenter) {
        this.engineerOfServiceCenter = engineerOfServiceCenter;
    }

    public String getCustomerOfServiceCenter() {
        return customerOfServiceCenter;
    }

    public void setCustomerOfServiceCenter(String customerOfServiceCenter) {
        this.customerOfServiceCenter = customerOfServiceCenter;
    }

    public String getDateOfIncomeDevice() {
        return dateOfIncomeDevice;
    }

    public void setDateOfIncomeDevice(String dateOfIncomeDevice) {
        this.dateOfIncomeDevice = dateOfIncomeDevice;
    }

    public String getDateOfOutDevice() {
        return dateOfOutDevice;
    }

    public void setDateOfOutDevice(String dateOfOutDevice) {
        this.dateOfOutDevice = dateOfOutDevice;
    }

    public String getDeviceOfServiceCenter() {
        return deviceOfServiceCenter;
    }

    public void setDeviceOfServiceCenter(String deviceOfServiceCenter) {
        this.deviceOfServiceCenter = deviceOfServiceCenter;
    }

    public double getPriceOfRepair() {
        return priceOfRepair;
    }

    public void setPriceOfRepair(double priceOfRepair) {
        this.priceOfRepair = priceOfRepair;
    }
}