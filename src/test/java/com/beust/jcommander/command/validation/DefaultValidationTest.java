/**
 * 
 */
package com.beust.jcommander.command.validation;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.command.CommandTest;

/**
 * @author a466245
 *
 */
public class DefaultValidationTest {
	
	@Test
	public void testDefaultIsValidated(){
		DefaultWithValidator dwv = new DefaultWithValidator();
		JCommander jCommander = new JCommander(dwv);
		
		try{
			jCommander.parse("fault");
			
			// Should not reach this point.
			Assert.assertTrue(false);
		}catch(ParameterException pe){
		
			// Make sure the exception is thrown
			Assert.assertTrue(true);
		}
		
	}
	
	public static void main(String[] args) {
	    new DefaultValidationTest().testDefaultIsValidated();
	  }

}
