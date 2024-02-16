package ENS380ASSIGNMENT3;
public class Inquirer {
    private String firstName;
    private String lastName;
    private String info;
    private String servicesPhone;

    /* Constructor */
    public Inquirer(String firstName, String lastName, String servicesPhone, String info) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.info = info;
        this.servicesPhone = servicesPhone;
    }

    /* Getters */
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInfo() {
        return info;
    }
    public String getServicesPhoneNum() {
        return servicesPhone;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setServicesPhone(String servicesPhone) {
        this.servicesPhone = servicesPhone;
    }
}