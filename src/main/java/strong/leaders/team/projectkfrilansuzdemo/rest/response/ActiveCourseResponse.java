package strong.leaders.team.projectkfrilansuzdemo.rest.response;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.Course;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiveCourseResponse {
    public Long id;
    private Course cource;
    private Integer maxStudent;
    private Integer currentStudentsCount;
    private Date startDate;

}
