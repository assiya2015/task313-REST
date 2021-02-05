package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.entity.Role;
import web.repository.RoleDao;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Transactional
    public List<Role> getAllRoles() {
        return roleDao.findAll();
    }

    @Transactional
    public Role getRoleByName(String name) {
        return roleDao.getRoleByName(name);
    }
}
