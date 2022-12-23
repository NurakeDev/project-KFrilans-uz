package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.entity.Company;
import strong.leaders.team.projectkfrilansuzdemo.entity.Region;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.CompanyDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

public interface CompanyService {
    SingleResponse save(CompanyDto companyDTO);

    SingleResponse findAll();

    Company findById(Long id);

    SingleResponse update(CompanyDto companyDTO, Long id);

    SingleResponse delete(Long id);

    SingleResponse findAllByCategoryAndAddress(String region, String courseCategory);

    SingleResponse findAllByCourseName(String courseName);
}
