package com.dxc.repository;

import org.springframework.data.repository.CrudRepository;

import com.dxc.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
