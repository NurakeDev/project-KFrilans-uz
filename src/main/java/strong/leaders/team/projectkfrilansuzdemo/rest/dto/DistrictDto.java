package strong.leaders.team.projectkfrilansuzdemo.rest.dto;

import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import strong.leaders.team.projectkfrilansuzdemo.entity.Region;

public class DistrictDto {
    private String name;
    private String code;
    private Region region;
}
