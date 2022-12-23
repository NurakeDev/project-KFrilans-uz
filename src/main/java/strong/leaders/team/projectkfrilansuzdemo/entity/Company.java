package strong.leaders.team.projectkfrilansuzdemo.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "companies")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_name")
    private String name;

    @Column(name = "company_details")
    private String detail;

    @ManyToOne
    private User owner;

    @ManyToOne
    private Address address;

    @ManyToOne
    private Contact contact;

    @ManyToOne
    private CompanyCategory category;

}
