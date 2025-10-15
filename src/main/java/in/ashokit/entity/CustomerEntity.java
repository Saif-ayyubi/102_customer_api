package in.ashokit.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name= "name")
@Setter
@Getter
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    private String name;

    private String email;

    private String password;

    private String pwdUpdated;


    private String phoneNo;

    @UpdateTimestamp
    private LocalDate dateCreated;

    @CreationTimestamp
    private LocalDate lastUpdated;


}
