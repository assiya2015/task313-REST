package web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import web.entity.Role;

//@Repository
public interface RoleDao extends JpaRepository<Role, Long> {
    Role getRoleByName(String name);

}
