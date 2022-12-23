package strong.leaders.team.projectkfrilansuzdemo.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.enums.RoleName;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleDto {
    private RoleName roleName;
    private String description;
}
