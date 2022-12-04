package peaksoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}