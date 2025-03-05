package com.vxh.ecomerce_web.repository;

import com.vxh.ecomerce_web.modal.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller,Long> {
    Seller findByEmail(String email);
}
