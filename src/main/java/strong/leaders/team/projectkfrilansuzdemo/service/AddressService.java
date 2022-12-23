package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.rest.dto.AddressDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

public interface AddressService {
    SingleResponse save(AddressDto addressDTO);

    SingleResponse findAll();

    SingleResponse findById(Long id);

    SingleResponse update(AddressDto addressDTO, Long id);

    SingleResponse delete(Long id);
}
