package com.cg.ofr.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.ofr.entities.Tenant;
import com.cg.ofr.exception.TenantNotFoundException;
import com.cg.ofr.repository.TenantRepository;
@Service
public class TenantService  {
	@Autowired
	private TenantRepository tenantrepository;
	
	public String addTenant(Tenant tenant) {
		tenantrepository.save(tenant);
		return "Added";
	}
	
public List<Tenant> updateTenant(int tenant_id,int age) throws TenantNotFoundException {
		if(!tenantrepository.existsById(tenant_id)) {
			throw new TenantNotFoundException();
		
		}
	Tenant tenant=tenantrepository.findById(tenant_id).get();
	
	tenant.setAge(tenant_id);
	tenantrepository.flush();
	return tenantrepository.findAll();
}

public List<Tenant> deleteTenant(int tenant_id) throws TenantNotFoundException {
		if(!tenantrepository.existsById(tenant_id)) {
			throw new TenantNotFoundException();
	    }	
		tenantrepository.deleteById(tenant_id);	
			return tenantrepository.findAll();
}
	
public Tenant viewTenant(int tenant_id) throws TenantNotFoundException{
	    if(!tenantrepository.existsById(tenant_id)) {
	    	
			throw new TenantNotFoundException();
	    }	
			return tenantrepository.findById(tenant_id).get();
	}	

public List<Tenant> viewAllTenant(){
	return tenantrepository.findAll();
}



public List<Tenant> validateTenantById(int tenant_Id) {
	// TODO Auto-generated method stub
	return tenantrepository.findAll();
}	
}



