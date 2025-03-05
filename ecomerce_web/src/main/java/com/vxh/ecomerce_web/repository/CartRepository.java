package com.vxh.ecomerce_web.repository;

import com.vxh.ecomerce_web.modal.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {
}
