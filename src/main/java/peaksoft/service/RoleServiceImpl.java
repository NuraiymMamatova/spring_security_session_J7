package peaksoft.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.entities.Role;
import peaksoft.repository.RoleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl {

    private final RoleRepository roleRepository;

    public List<Role> findAllRole() {
        return roleRepository.findAll();
    }

    public void saveRole(Role role) {
        roleRepository.save(role);
    }

    public Role findByIdRole(Long id) {
        return roleRepository.findById(id).get();
    }

    public void deleteByIdRole(Long id) {
        roleRepository.deleteById(id);
    }
}
