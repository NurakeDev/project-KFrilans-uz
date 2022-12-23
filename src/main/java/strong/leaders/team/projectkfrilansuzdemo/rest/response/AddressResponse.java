package strong.leaders.team.projectkfrilansuzdemo.rest.response;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.District;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
    private Long id;
    private String home;
    private String street;
    private District district;
}
