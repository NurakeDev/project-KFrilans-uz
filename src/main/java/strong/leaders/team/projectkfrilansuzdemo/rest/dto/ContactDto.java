package strong.leaders.team.projectkfrilansuzdemo.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactDto {
    private String phone;
    private String email;
}
