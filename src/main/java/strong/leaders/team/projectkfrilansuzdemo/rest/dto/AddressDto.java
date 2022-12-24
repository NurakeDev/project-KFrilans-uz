package strong.leaders.team.projectkfrilansuzdemo.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.District;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AddressDto {
    private String home;
    private String street;
    private District district;
}
