package com.hanz.mbs.web;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import net.hasor.core.ApiBinder;
import net.hasor.core.DimModule;
import net.hasor.db.JdbcModule;
import net.hasor.db.Level;
import net.hasor.spring.SpringModule;

@DimModule
@Component
public class HasorComponent implements SpringModule{

	private final DataSource dataSource;

	public HasorComponent(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void loadModule(ApiBinder apiBinder) throws Throwable {
		apiBinder.installModule(new JdbcModule(Level.Full, this.dataSource));
	}
}
