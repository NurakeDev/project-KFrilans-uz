package strong.leaders.team.projectkfrilansuzdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "district_name")
    private String name;

    @Column(name = "district_name")
    private String code;

    @ManyToOne
    private Region region;

}
