package szakdolgozat;

/**
 *
 * @author Juhasz Levente
 */
public class PassengerInfo {

    private String firstName, lastName, gender, birthdate, luggage;
    private int payable;

    public String getFirstName() {
        return firstName;
    }

    public PassengerInfo(String firstName, String fastName, String gender, String birthdate, String luggage, int payable) {
        this.firstName = firstName;
        this.lastName = fastName;
        this.gender = gender;
        this.birthdate = birthdate;
        this.luggage = luggage;
        this.payable = payable;
    }

    @Override
    public String toString() {
        return "firstName=" + firstName + ", fastName=" + lastName + ", gender=" + gender + ", birthdate=" + birthdate + ", luggage=" + luggage + ", payable=" + payable;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String fastName) {
        this.lastName = fastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getLuggage() {
        return luggage;
    }

    public void setLuggage(String luggage) {
        this.luggage = luggage;
    }

    public int getPayable() {
        return payable;
    }

    public void setPayable(int payable) {
        this.payable = payable;
    }

}
