package strong.leaders.team.projectkfrilansuzdemo.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.CourseCategory;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CourseCategoryDto {
    private String name;
    private String description;
    private CourseCategory parentId;

}
