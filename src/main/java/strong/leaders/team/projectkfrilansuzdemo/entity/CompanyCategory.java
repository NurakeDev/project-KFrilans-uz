package strong.leaders.team.projectkfrilansuzdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "addresses")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class CompanyCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "company_category_name")
    private String name;

    @Column(name = "company_category_description")
    private String description;

}