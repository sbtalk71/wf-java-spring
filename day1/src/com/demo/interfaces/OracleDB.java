package com.demo.interfaces;

public class OracleDB implements MyConnection {

	@Override
	public String getProductDetails() {

		return "Oracle 12c";
	}

	@Override
	public String getConnectionInfo() {

		return "Got connected to Oracle DB";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Oracle Db ";
	}
}
