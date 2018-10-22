import java.util.*;
import java.io.*;
public class Mufasa {
	String firstName;
	String lastName;
	String password;
	String country;
	String birthday;
	String phonenumber;
	String email;
	private Scanner scanString;
	public void setFirstName()
	{
		scanString = new Scanner(System.in);
		firstName=scanString.next();
	}
	public void setLastName()
	{
		lastName=scanString.next();
	}
	public void setPwd()
	{
		boolean flag=false;
		password=scanString.next();
		flag=reEnterPwd(password);
		if(flag==true)
		{
			writeDB();
		}
	}
	private boolean reEnterPwd(String firstPWD)
	{
		String secondPWD=scanString.next();
		if(firstPWD==secondPWD)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public void selectCountry()
	{
		
	}
	public void setBDay(String dd, String mm, String yyyy)
	{
		
	}
	public void setPNBR()
	{
		
	}
	public void setEmail(String emailSet)
	{
		
	}
	private void checkEmail()
	{
		
	}
	public Double getUserInfo()
	{
		
	}
	public Double secondDouble()
	{
		
	}
	private void writeDB()
	{
		
	}
	public void readDB(userDB db)
	{
		
	}
}
