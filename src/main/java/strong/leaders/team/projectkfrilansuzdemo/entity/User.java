package strong.leaders.team.projectkfrilansuzdemo.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Hibernate;

import java.util.Objects;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "first_name")
    private String firstname;

    @Column(nullable = false, name = "last_name")
    private String lastname;

    @Column(name = "age")
    private Integer age;

    @Column(unique = true, name = "phone_numbers")
    private String phone;

    @ManyToOne      // Many Users To One Role
    private Role role;

//    public User(String firstname, String lastname, String phone, String email, String password, Role role) {
//        this.firstname = firstname;
//        this.lastname = lastname;
//        this.phone = phone;
//        this.email = email;
//        this.password = password;
//        this.role = role;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        User user = (User) o;
        return id != null && Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
