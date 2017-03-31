package com.mk.general;

import java.io.IOException;
import java.sql.SQLException;

class SuperClass {
	public String getData(String str) throws SQLException {
		return str;
	}

}

public class OverridingException extends SuperClass {

	@Override
	public String getData(String str) throws ArithmeticException {
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/*
	 * Private method cann't be overriden overriden method should not be more
	 * restrictive.
	 * 
	 * super and child method's can't throw same level exceptions like
	 * IOException & SQLException
	 */
}
