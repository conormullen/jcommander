/**
 * 
 */
package com.beust.jcommander.command.validation;

import java.util.List;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;

/**
 * @author a466245
 *
 */
public class DefaultWithValidator {
	
	@Parameter(description="My Value", validateWith=DefaulValidation.class)
	public List<String> defaultString;

}

class DefaulValidation implements IParameterValidator {

	@Override
	public void validate(String name, String value) throws ParameterException {
		if(!value.equals("default")){
			throw new ParameterException("Value: " + value + " Does not meet default");
		}
		
	}
	
}
