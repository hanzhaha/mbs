package com.hanz.service.mbs;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hanz.dao.mbs.S9supplierMapper;
import com.hanz.domain.mbs.S9supplier;
import com.hanz.utils.json.JsonUtils;

@Service
public class SupplierService {

	@Autowired
	private S9supplierMapper s9SupplierMapper;


	@Autowired
	private RedisTemplate<String, Serializable> redisTemplate;

	private Logger logger = LoggerFactory.getLogger(getClass());

	public S9supplier selectS9supplier(Integer id) throws JsonProcessingException {
		S9supplier s9supplier = s9SupplierMapper.selectByPrimaryKey(id);
		redisTemplate.opsForValue().set("test", s9supplier);
		boolean exists = redisTemplate.hasKey("test");
		logger.info("{}", exists);
		S9supplier redissupplier = (S9supplier)redisTemplate.opsForValue().get("test");
		logger.info("{}", JsonUtils.toJson(redissupplier));
		return s9supplier;
	}
}
