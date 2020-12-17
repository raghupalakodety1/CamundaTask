import static org.junit.Assert.*;

import org.junit.Test;

import com.camundatask.UserClient;

public class UsersTest {

	@Test
	public void getNumberOfUsers() throws Exception {
		UserClient userClient = new UserClient();
		
		int numberOfUsers = userClient.queryUsers().size();
		
		assertEquals(6, numberOfUsers);
	}
	
	@Test
	public void checkFirstNameOfFirstUser() throws Exception {
		UserClient userClient = new UserClient();
		
		String first_name = userClient.queryUsers().get(0).getFirst_name();
		
		assertEquals("George", first_name);
	}

}
