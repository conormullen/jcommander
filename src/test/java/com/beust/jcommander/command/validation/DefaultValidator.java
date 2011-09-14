/**
 * 
 */
package com.beust.jcommander.command.validation;

import java.util.ArrayList;
import java.util.List;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

/**
 * @author a466245
 *
 */
public class DefaultValidator implements IParameterValidator {
	
	
	private final List<String> defaultValue = new ArrayList<String>();
	
	{
		defaultValue.add("test1");
		defaultValue.add("test2");
	};
	
	@Override
	public void validate(String name, String value) throws ParameterException {
		
		if(!defaultValue.contains(value)){
			throw new ParameterException("Invalid");
		}	
		
	}

}
