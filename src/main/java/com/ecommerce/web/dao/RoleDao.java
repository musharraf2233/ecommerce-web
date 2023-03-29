package com.ecommerce.web.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.web.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
