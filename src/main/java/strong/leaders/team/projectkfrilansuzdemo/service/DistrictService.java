package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.rest.dto.DistrictDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

public interface DistrictService {
    SingleResponse findAll();

    SingleResponse save(DistrictDto districtDTO);

    SingleResponse findById(Long id);

    SingleResponse update(DistrictDto districtDTO, Long id);

    SingleResponse delete(Long id);

}
