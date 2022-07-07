package com.cg.ofr.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ofr.entities.Tenant;
import com.cg.ofr.exception.TenantNotFoundException;
import com.cg.orf.service.TenantService;
@RestController
//@RequestMapping("/Tenant")
public class TenantController {
	
	private TenantService itenantService;
	@PostMapping
	public String addTenant(@RequestBody Tenant tenant) {
		return itenantService.addTenant(tenant);
	}
	
	@PutMapping("/tenant_id/{age}")
	public List<Tenant> updateTenant(@PathVariable("tenant_id") int tenant_id,@PathVariable("Age") int Age) throws TenantNotFoundException {
		return itenantService.updateTenant(tenant_id,Age);
	}
	
	@DeleteMapping("/tenant_id")
	public List<Tenant>  deletetenant(@PathVariable("tenant_id") int tenant_id) throws TenantNotFoundException {
		return itenantService.deleteTenant(tenant_id);
	}
	
	@GetMapping("/tenant_id")
	public Tenant viewTenantById(@PathVariable("tenant_id") int tenant_id) throws TenantNotFoundException {
		return itenantService.viewTenant(tenant_id);
	}
	@GetMapping("/viewAll")
	public List<Tenant> viewAllTenant() {
		return itenantService.viewAllTenant();
	}
	
	@GetMapping("/validateTenantById")
	public List<Tenant> validateTenantById(@PathVariable("tenant_id") int tenant_Id) {
		return itenantService. validateTenantById(tenant_Id);
	}

}

	


