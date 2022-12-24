package strong.leaders.team.projectkfrilansuzdemo.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.Role;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {
    private String firstname;
    private String lastname;
    private Integer age;
    private String phone;
    private Role role;

}
