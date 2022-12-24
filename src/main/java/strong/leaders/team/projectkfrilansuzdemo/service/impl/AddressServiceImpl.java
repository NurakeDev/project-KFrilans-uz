package strong.leaders.team.projectkfrilansuzdemo.service.impl;

import org.springframework.stereotype.Service;
import strong.leaders.team.projectkfrilansuzdemo.entity.Address;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.AddressDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {
    @Override
    public SingleResponse save(AddressDto addressDTO) {
        Address address = new Address();
        address.setHome(addressDTO.getHome());
        address.setDistrict(addressDTO.getDistrict());
        address.setStreet(addressDTO.getStreet());

        return new SingleResponse(true, "Address created!");
    }

    @Override
    public SingleResponse findAll() {
        return null;
    }

    @Override
    public SingleResponse findById(Long id) {
        return null;
    }

    @Override
    public SingleResponse update(AddressDto addressDTO, Long id) {
        return null;
    }

    @Override
    public SingleResponse delete(Long id) {
        return null;
    }
}
