package com.src.persistencetest;

import junit.framework.TestCase;
import com.src.persistence.DBDAO;
import java.sql.*;
import java.util.Scanner; 


public class DBDAOTest extends TestCase {
	
	public void testIsInstanceOfDBDAO() {
		DBDAO dao = new DBDAO();
		Boolean isInstanceOfDBDAO = dao instanceof DBDAO;
		assertTrue(isInstanceOfDBDAO);
	}
	
	public void testDBDAO() {
		// pw 0
		DBDAO dao = new DBDAO();
		Connection conn = dao.getConnection();
		assertNotNull(conn);
	}

	
}
