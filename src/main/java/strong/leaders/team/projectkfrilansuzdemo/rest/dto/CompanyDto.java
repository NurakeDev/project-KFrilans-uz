package strong.leaders.team.projectkfrilansuzdemo.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import strong.leaders.team.projectkfrilansuzdemo.entity.Address;
import strong.leaders.team.projectkfrilansuzdemo.entity.CompanyCategory;
import strong.leaders.team.projectkfrilansuzdemo.entity.Contact;
import strong.leaders.team.projectkfrilansuzdemo.entity.User;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CompanyDto {
    private String name;
    private String detail;
    private User owner;
    private Address address;
    private Contact contact;
    private CompanyCategory category;

}
