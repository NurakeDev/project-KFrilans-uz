package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.entity.Region;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

public interface RegionService {
    SingleResponse save(Region region);

    SingleResponse findAll();

    SingleResponse findById(Long id);

    SingleResponse update(Region region, Long id);

    SingleResponse delete(Long id);

}
