package strong.leaders.team.projectkfrilansuzdemo.rest.response;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegionResponse {
    private Long id;
    private String name;
    private String code;

}
