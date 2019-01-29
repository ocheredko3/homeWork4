package serviceCenter;

public class TicketOfServiceCenter {
    private String adminOfServiceCenter;
    private String engineerOfServiceCenter;
    private String customerOfServiceCenter;
    private String dateOfIncomeDevice;
    private String getDateOfOutDevice;
    private String deviceOfServiceCenter;
    private double priceOfRepair;

    public TicketOfServiceCenter(String adminOfServiceCenter, String engineerOfServiceCenter, String customerOfServiceCenter,
                                 String dateOfIncomeDevice, String getDateOfOutDevice, String deviceOfServiceCenter, double priceOfRepair) {
        this.adminOfServiceCenter = adminOfServiceCenter;
        this.engineerOfServiceCenter = engineerOfServiceCenter;
        this.customerOfServiceCenter = customerOfServiceCenter;
        this.dateOfIncomeDevice = dateOfIncomeDevice;
        this.getDateOfOutDevice = getDateOfOutDevice;
        this.deviceOfServiceCenter = deviceOfServiceCenter;
        this.priceOfRepair = priceOfRepair;
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

    public String getGetDateOfOutDevice() {
        return getDateOfOutDevice;
    }

    public void setGetDateOfOutDevice(String getDateOfOutDevice) {
        this.getDateOfOutDevice = getDateOfOutDevice;
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
