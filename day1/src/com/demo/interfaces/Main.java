package com.demo.interfaces;

public class Main {

	public static void main(String[] args) {
		MyConnection con = ConFactory.getConnection("oracle");
		System.out.println(MyConnection.version);
		System.out.println(con.getProductDetails());
		System.out.println(con.getConnectionInfo());
		
		System.out.println(con);

	}

}
