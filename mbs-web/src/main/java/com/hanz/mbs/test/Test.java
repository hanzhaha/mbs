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
		System.out.print(111);
		return supplierService.selectS9supplier(507);
	}
}
