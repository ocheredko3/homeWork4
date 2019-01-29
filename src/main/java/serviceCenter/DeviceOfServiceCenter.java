package serviceCenter;

public class DeviceOfServiceCenter {
    private String serialNumber;
    private String model;
    private String nomination;
    private String price;
    private String manufacturedDate;
    private String countOfRepair;

    public DeviceOfServiceCenter(String serialNumber, String model, String nomination, String price, String manufacturedDate, String countOfRepair) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.nomination = nomination;
        this.price = price;
        this.manufacturedDate = manufacturedDate;
        this.countOfRepair = countOfRepair;
    }



    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNomination() {
        return nomination;
    }

    public void setNomination(String nomination) {
        this.nomination = nomination;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(String manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public String getCountOfRepair() {
        return countOfRepair;
    }

    public void setCountOfRepair(String countOfRepair) {
        this.countOfRepair = countOfRepair;
    }
}