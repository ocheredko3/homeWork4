package employees;

public class Employee {
    private String workPlace;
    private String position;
    private String arrivalDate;
    private String dateOfDismissal;
    private double salary;
    private String initials;
    private String phone;
    private String address;

    public Employee(String workPlace, String position, String arrivalDate, String dateOfDismissal,
                    double salary, String initials, String phone, String address) {
        this.workPlace = workPlace;
        this.position = position;
        this.arrivalDate = arrivalDate;
        this.dateOfDismissal = dateOfDismissal;
        this.salary = salary;
        this.initials = initials;
        this.phone = phone;
        this.address = address;
    }

    public void work() {
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDateOfDismissal() {
        return dateOfDismissal;
    }

    public void setDateOfDismissal(String dateOfDismissal) {
        this.dateOfDismissal = dateOfDismissal;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

