package strong.leaders.team.projectkfrilansuzdemo.service.impl;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import strong.leaders.team.projectkfrilansuzdemo.entity.Role;
import strong.leaders.team.projectkfrilansuzdemo.entity.User;
import strong.leaders.team.projectkfrilansuzdemo.repository.RoleRepository;
import strong.leaders.team.projectkfrilansuzdemo.repository.UserRepository;
import strong.leaders.team.projectkfrilansuzdemo.rest.dto.RoleDto;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.RoleResponse;
import strong.leaders.team.projectkfrilansuzdemo.rest.response.SingleResponse;
import strong.leaders.team.projectkfrilansuzdemo.service.RoleService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository repository;
    private final UserRepository userRepository;

    public RoleServiceImpl(RoleRepository repository,
                           UserRepository userRepository) {
        this.repository = repository;
        this.userRepository = userRepository;
    }

    @Override
    public SingleResponse save(RoleDto dto) {
        Role role = new Role();
        role.setRoleName(dto.getRoleName());
        role.setDescription(dto.getDescription());
        Role savedRole = repository.save(role);
        return new SingleResponse(true, "Role successfully created!");
    }

    @Override
    public SingleResponse findAll() {
        List<Role> roleList = repository.findAll();
        List<RoleResponse> resultList = new ArrayList<>();

        for (Role role : roleList) {
            RoleResponse roleResponse =
                    new RoleResponse(
                            role.getId(),
                            role.getRoleName(),
                            role.getDescription());
            resultList.add(roleResponse);
        }

        return new SingleResponse(true, "Role List", resultList);
    }

    @Override
    public SingleResponse findById(Long roleId) {
        Optional<Role> optionalRole = repository.findById(roleId);
        if (optionalRole.isPresent()) {
            Role role = optionalRole.get();
            RoleResponse roleResponse = new RoleResponse(
                    role.getId(),
                    role.getRoleName(),
                    role.getDescription()
            );
            return new SingleResponse(true, "Role with ID {" + roleId + "}", roleResponse);
        }
        return new SingleResponse(false, "Role Not Found with ID {" + roleId + "}", HttpStatus.NOT_FOUND);
    }

    @Override
    public SingleResponse edit(Long roleId, RoleDto dto) {
        Optional<Role> optionalRole = repository.findById(roleId);
        if (optionalRole.isPresent()) {
            Role entity = optionalRole.get();

            if (dto.getRoleName() != null && !entity.getRoleName().equals(dto.getRoleName()))
                entity.setRoleName(dto.getRoleName());

            if (dto.getDescription() != null && !entity.getDescription().equals(dto.getDescription()))
                entity.setDescription(dto.getDescription());

            repository.save(entity);
            return new SingleResponse(true, "Role successfully updated!");
        }
        return new SingleResponse(false, "Role Not Found with ID {" + roleId + "}", HttpStatus.NOT_FOUND);
    }

    @Override
    public SingleResponse delete(Long roleId) {
        Optional<Role> optionalRole = repository.findById(roleId);
        if (optionalRole.isPresent()) {
            Role role = optionalRole.get();
            List<User> userList = userRepository.findAllByRole(role);
            userRepository.deleteAll(userList);
            repository.delete(role);
            return new SingleResponse(true, "Role Successfully deleted!");
        }
        return new SingleResponse(false, "Role Not Found with id " + roleId, HttpStatus.NOT_FOUND);
    }}
