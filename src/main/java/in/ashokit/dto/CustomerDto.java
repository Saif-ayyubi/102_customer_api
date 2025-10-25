package in.ashokit.dto;
import lombok.Data;
import java.time.LocalDate;

public class CustomerDto {

    private Integer customerId;
    private String name;
    private String email;

    //@JsonIgnore // when you don't want it should go to frontend
    private String password;
    private String pwdUpdated;
    private String phoneNo;
    private LocalDate dateCreated;
    private LocalDate lastUpdated;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPwdUpdated() {
        return pwdUpdated;
    }

    public void setPwdUpdated(String pwdUpdated) {
        this.pwdUpdated = pwdUpdated;
    }
}
