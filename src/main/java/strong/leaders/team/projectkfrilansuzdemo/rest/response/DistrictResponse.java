package strong.leaders.team.projectkfrilansuzdemo.rest.response;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.Region;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DistrictResponse {
    private Long id;
    private String name;
    private String code;
    private Region region;

}
