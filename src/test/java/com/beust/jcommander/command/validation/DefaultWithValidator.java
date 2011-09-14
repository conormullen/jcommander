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
	
	@Parameter(description="My Value", validateWith=DefaultValidator.class)
	public List<String> defaultString;
	
	@Parameter(names={"-f"}, description="My Flag")
	public String flag;

}


