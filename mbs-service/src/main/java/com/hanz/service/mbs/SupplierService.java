package com.hanz.service.mbs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hanz.dao.mbs.S9supplierMapper;
import com.hanz.domain.mbs.S9supplier;

@Service
public class SupplierService {

	@Autowired
	private S9supplierMapper s9SupplierMapper;

	public S9supplier selectS9supplier(Integer id) {
		return s9SupplierMapper.selectByPrimaryKey(id);
	}
}
