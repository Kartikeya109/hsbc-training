/**
 * 
 */
package com.demo.impl.oracle;

import com.demo.interfaces.MyConnection;

/**
 * @author Kartikeya
 *
 */
public class OracleDB implements MyConnection {
	
	@Override
	public String getConnectionInfo() {
		// TODO Auto-generated method stub
		return "Connection established";
	}
	
	@Override
	public String getDbDetails() {
		// TODO Auto-generated method stub
		return "Db created";
	}
}
