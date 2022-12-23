package strong.leaders.team.projectkfrilansuzdemo.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.enums.RoleName;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleResponse {
    private Long id;
    private RoleName roleName;
    private String description;
}
