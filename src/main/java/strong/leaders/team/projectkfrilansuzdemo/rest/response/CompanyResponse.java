package strong.leaders.team.projectkfrilansuzdemo.rest.response;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.Address;
import strong.leaders.team.projectkfrilansuzdemo.entity.CompanyCategory;
import strong.leaders.team.projectkfrilansuzdemo.entity.Contact;
import strong.leaders.team.projectkfrilansuzdemo.entity.User;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CompanyResponse {
    private Long id;
    private String name;
    private String detail;
    private User owner;
    private Address address;
    private Contact contact;
    private CompanyCategory category;

}
