package strong.leaders.team.projectkfrilansuzdemo.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.Company;
import strong.leaders.team.projectkfrilansuzdemo.entity.CourseCategory;
import strong.leaders.team.projectkfrilansuzdemo.entity.Topic;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseResponse {
    private Long id;
    private String name;
    private List<Topic> topics;
    private String description;
    private Company company;
    private CourseCategory category;
    private Double price;
}
