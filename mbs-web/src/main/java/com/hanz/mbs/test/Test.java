package com.hanz.mbs.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hanz.domain.mbs.S9supplier;
import com.hanz.service.mbs.SupplierService;

@RestController
public class Test {

	@Autowired
	private SupplierService supplierService;

	@GetMapping(path = "/hello")
	public S9supplier hello() {
		S9supplier s9supplier = new S9supplier();
		try {
			s9supplier = supplierService.selectS9supplier(507);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return s9supplier;
	}
}
