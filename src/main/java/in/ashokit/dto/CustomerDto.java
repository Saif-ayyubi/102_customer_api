package in.ashokit.dto;
import lombok.Data;
import java.time.LocalDate;

@Data
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
}
