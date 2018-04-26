package com.godfrey.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.godfrey.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
