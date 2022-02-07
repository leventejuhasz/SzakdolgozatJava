package szakdolgozat;

public class User{
    
    private String firstName, lastName, adress;
    private int contactNum;
    private String city, country, gender, emailId, customerId, customerPassword;
    
    public User(String firstName, String lastName, String adress, int contactNum, String city, String country, String gender, String emailId, String customerId, String customerPassword) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAdress(adress);
        this.setContactNum(contactNum);
        this.setCity(city);
        this.setCountry(country);
        this.setGender(gender);
        this.setEmailId(emailId);
        this.setCustomerId(customerId);
        this.setCustomerPassword(customerPassword);
    }

    @Override
    public String toString() {
        return "registrationInfo{" + "firstName=" + firstName + ", lastName=" + lastName + ", adress=" + adress + ", contactNum=" + contactNum + ", city=" + city + ", country=" + country + ", gender=" + gender + ", emailId=" + emailId + ", customerId=" + customerId + ", customerPassword=" + customerPassword + '}';
    }
    
    
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getAdress() {
        return adress;
    }
    
    public void setAdress(String adress) {
        this.adress = adress;
    }
    
    public int getContactNum() {
        return contactNum;
    }
    
    public void setContactNum(int contactNum) {
        this.contactNum = contactNum;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCountry() {
        return country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getEmailId() {
        return emailId;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    
    public String getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    public String getCustomerPassword() {
        return customerPassword;
    }
    
    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }
    
}
