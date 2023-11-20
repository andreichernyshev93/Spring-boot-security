package ru.kata.spring.boot_security.demo.dao;

import ru.kata.spring.boot_security.demo.model.Role;

import javax.persistence.EntityManager;
import java.util.List;

public class RoleDaoImpl implements RoleDao{
    private EntityManager entityManager;

    public RoleDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("select r from Role r", Role.class).getResultList();
    }
}
