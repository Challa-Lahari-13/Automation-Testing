package com.socialsite.signup;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class signupTest {
	/*public static void main(String[] args) {
		System.out.println(signup.name("John"));
		System.out.println(signup.surname("Challa"));
		System.out.println(signup.pwd("12345678"));
		System.out.println(signup.dob("2024/08/13"));
		System.out.println(signup.mob(797979679));
		if(signup.name("John")&&signup.surname("Watson")&& signup.pwd("12345678")&&signup.dob("2022/10/10")&&signup.mob(797979679))
			System.out.println("Login Successful");
		else
			System.out.println("Wrong Credentials");
	}
	
	
	//Testing using junit
	@Test
	public void shouldAnswerWithTrue() {
        //assertTrue(signup.name("Lahari")&&signup.surname("Challa")&& signup.pwd("1234")&&signup.dob("2024/08/13")&&signup.mob(98763356));
        assertTrue(signup.name("John")&&signup.surname("Watson")&& signup.pwd("12345678")&&signup.dob("2022/10/10")&&signup.mob(797979679));
    }
	@Test
	public void test2() {
		assertTrue(signup.name("John")&&signup.surname("Watson")&& signup.pwd("12345678")&&signup.dob("2022/10/10")&&signup.mob(797979679));
	}*/
	
	
	public static void main(String[] args) {
		signup s=new signup();
		String regex="^(.+)@(.+)$";
		//String regex="^(.+)@gmail.com$";
		String email=s.useremail("abc@yahoo.com");
		Pattern pattern=Pattern.compile(regex);
		
		Matcher match=pattern.matcher(email);
		//System.out.println("Is it match?"+match.matches());
		System.out.println("---------------------------");
		if(match.matches())
		{
			System.out.println(email);
			int pwd=s.password(4646456);
			System.out.println(pwd);
			s.login();
		}
		else
			System.out.println("Enter correct gmail");
		
		
	}

}

