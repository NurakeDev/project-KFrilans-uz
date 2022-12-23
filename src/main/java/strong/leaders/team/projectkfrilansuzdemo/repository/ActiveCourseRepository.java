package strong.leaders.team.projectkfrilansuzdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import strong.leaders.team.projectkfrilansuzdemo.entity.ActiveCourse;

@Repository
public interface ActiveCourseRepository extends JpaRepository<ActiveCourse, Long> {
}
