package com.demo.interfaces;

public interface MyConnection {

	int version = 1;

	String getProductDetails();

	String getConnectionInfo();

	default String getMajorVersion() {
		return "To be implemented";
	}
}
