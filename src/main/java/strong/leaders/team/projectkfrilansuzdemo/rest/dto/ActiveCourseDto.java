package strong.leaders.team.projectkfrilansuzdemo.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.Course;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ActiveCourseDto {
    private Course cource;
    private Integer maxStudent;
    private Integer currentStudentsCount;
    private Date startDate;
}
