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

    private void work() {
    }


}

