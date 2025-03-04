package com.vxh.ecomerce_web.repository;

import com.vxh.ecomerce_web.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
