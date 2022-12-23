package strong.leaders.team.projectkfrilansuzdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import strong.leaders.team.projectkfrilansuzdemo.entity.CompanyCategory;

@Repository
public interface CompanyCategoryRepository extends JpaRepository<CompanyCategory, Long> {
}
