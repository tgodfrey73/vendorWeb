package com.godfrey.vendor.services;

import java.util.List;

import com.godfrey.vendor.entities.Vendor;

public interface VendorService {
	
	Vendor saveVendor(Vendor vendor);
	
	Vendor updateVendor(Vendor vendor);
	
	void deleteVendor(Vendor vendor); 
	
	Vendor getVendorById(int id);
	
	List<Vendor> getAllVendors();
	

}
