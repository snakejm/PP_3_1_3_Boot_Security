package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleService {

    void addRole(Role role);

    Role findByRole(String role);

    List<Role> listRoles();
}
