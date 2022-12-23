package strong.leaders.team.projectkfrilansuzdemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @ManyToOne
    private Course cource;

    @Column(name = "maximum_student")
    private Integer maxStudent;

    @Column(name = "current_student_count")
    private Integer currentStudentsCount;

    @Column(name = "start_course_date")
    private Date startDate;

}
