package strong.leaders.team.projectkfrilansuzdemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import strong.leaders.team.projectkfrilansuzdemo.entity.Role;
import strong.leaders.team.projectkfrilansuzdemo.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAllByRole(Role role);

}
