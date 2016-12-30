package com.ecom.powercart1.daotemp;

public class UserDAO {

	public boolean isValidCredentials(String id,String password) {
		// TODO Auto-generated method stub
		if(id.equals("akshi") && password.equals("akshi"))
		{
		return true;
		}
		else
		{
			return false;
	}
	}
}
