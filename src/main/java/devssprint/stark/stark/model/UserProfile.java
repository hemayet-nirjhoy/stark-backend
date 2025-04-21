package devssprint.stark.stark.model;

import jakarta.persistence.*;

@Entity
@Table (name = "user_profile")
public class UserProfile {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zip;

}
