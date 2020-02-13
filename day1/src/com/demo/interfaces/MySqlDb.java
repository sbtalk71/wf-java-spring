package com.demo.interfaces;

public class MySqlDb implements MyConnection {

	@Override
	public String getProductDetails() {

		return "MySQL 6";
	}

	@Override
	public String getConnectionInfo() {

		return "Got connected to MySLQ DB";
	}

}
