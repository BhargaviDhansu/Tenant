package com.cg.ofr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.ofr.entities.Tenant;

public interface TenantRepository extends JpaRepository<Tenant,Integer> {

}
