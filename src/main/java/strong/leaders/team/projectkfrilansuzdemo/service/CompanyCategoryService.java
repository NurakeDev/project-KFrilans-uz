package strong.leaders.team.projectkfrilansuzdemo.service;

import strong.leaders.team.projectkfrilansuzdemo.entity.CompanyCategory;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;

public interface CompanyCategoryService {
    SingleResponse save(CompanyCategory companyCategory);

    SingleResponse findAll();

    CompanyCategory findById(Long id);

    SingleResponse update(CompanyCategory companyCategory, Long id);

    SingleResponse delete(Long id);
}
