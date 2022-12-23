package strong.leaders.team.projectkfrilansuzdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "courses")
public class Course {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "course_name")
        private String name;

        @Column(name = "course_description")
        private String description;

        @ManyToOne
        private Company company;

        @ManyToOne
        private CourseCategory category;

        @Column(name = "course_price")
        private Double price;

}
