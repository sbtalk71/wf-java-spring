package com.demo.interfaces;

public class ConFactory {

	public static MyConnection getConnection(String db) {
		if(db.equals("mysql")) {
			return new MySqlDb();
		}else if(db.equals("oracle")) {
			return new OracleDB();
		}else {
			throw new RuntimeException("DB not supported..");
		}
	}
}
