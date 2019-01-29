package serviceCenter;

public class ServiceCenter {
    private int idServiceCenter;
    private String contactOfServiceCenter;
    private String addressOfServiceCenter;
    private String workTimeOfServiceCenter;
    private void emloyeesOfServiceCenter(){

    }

    public ServiceCenter(int idServiceCernter, String contactOfServiceCenter, String adrressOfServiceCenter, String workTimeOfServiceCenter) {
        this.idServiceCenter = idServiceCernter;
        this.contactOfServiceCenter = contactOfServiceCenter;
        this.addressOfServiceCenter = adrressOfServiceCenter;
        this.workTimeOfServiceCenter = workTimeOfServiceCenter;
    }

    public int getIdServiceCernter() {
        return idServiceCenter;
    }

    public void setIdServiceCernter(int idServiceCernter) {
        this.idServiceCenter = idServiceCernter;
    }

    public String getContactOfServiceCenter() {
        return contactOfServiceCenter;
    }

    public void setContactOfServiceCenter(String contactOfServiceCenter) {
        this.contactOfServiceCenter = contactOfServiceCenter;
    }

    public String getAdrressOfServiceCenter() {
        return addressOfServiceCenter;
    }

    public void setAdrressOfServiceCenter(String adrressOfServiceCenter) {
        this.addressOfServiceCenter = adrressOfServiceCenter;
    }

    public String getWorkTimeOfServiceCenter() {
        return workTimeOfServiceCenter;
    }

    public void setWorkTimeOfServiceCenter(String workTimeOfServiceCenter) {
        this.workTimeOfServiceCenter = workTimeOfServiceCenter;
    }
}
