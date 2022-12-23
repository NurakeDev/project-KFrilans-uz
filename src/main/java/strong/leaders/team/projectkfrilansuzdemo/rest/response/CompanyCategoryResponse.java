package strong.leaders.team.projectkfrilansuzdemo.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyCategoryResponse {
    private Long id;
    private String name;
    private String description;

}
