package com.godfrey.vendor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.godfrey.vendor.controllers.VendorController;

@SpringBootApplication
public class VendorWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorWebApplication.class, args);
	}
}
