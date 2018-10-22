import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import fi.oulu.tol.sqat.StockMarket;

public class Person {

	Mufasa testMuf;
	userDB testDB;
	@Before
	public void setup(){
		testMuf=new Mufasa();
		testDB=EasyMock.createMock(userDB.class);
		testMuf.readDB(testDB);
	}
	@Test
	public void test() {
		EasyMock.expect(testDB.getUserInfo("Sakari")).andReturn("Sakari Järvelä");
		EasyMock.replay(testDB);
		Mufasa sakari = new Mufasa("Sakari",1);
	}

}
