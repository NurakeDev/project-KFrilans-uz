package strong.leaders.team.projectkfrilansuzdemo.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.Company;
import strong.leaders.team.projectkfrilansuzdemo.entity.CourseCategory;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseResponse {
    private Long id;
    private String name;
    private String description;
    private Company company;
    private CourseCategory category;
    private Double price;
}
