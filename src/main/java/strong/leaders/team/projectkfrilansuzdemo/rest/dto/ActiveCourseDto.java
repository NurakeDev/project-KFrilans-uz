package strong.leaders.team.projectkfrilansuzdemo.rest.dto;

import lombok.*;
import strong.leaders.team.projectkfrilansuzdemo.entity.Course;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class ActiveCourseDto {
    private Course course;
    private Integer maxStudent;
    private Integer currentStudentsCount;
    private Date startDate;
}
