public class Inquirer {
    private String firstName;
    private String lastName;
    private String info;
    private String servicesPhone;

    /* Constructor */
    public Inquirer(String firstName, String lastName, String info, String servicesPhone) {
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

    public String getServicesPhone() {
        return servicesPhone;
    }
}