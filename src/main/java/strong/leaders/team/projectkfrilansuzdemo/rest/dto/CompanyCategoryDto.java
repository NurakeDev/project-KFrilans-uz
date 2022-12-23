package strong.leaders.team.projectkfrilansuzdemo.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyCategoryDto {
    private Long id;
    private String name;
    private String description;

}
