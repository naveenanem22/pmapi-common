package com.pc.custom.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class MaritalStatusValidator implements ConstraintValidator<MaritalStatusConstraint, String> {

	@Autowired
	private Environment env;

	@Override
	public void initialize(MaritalStatusConstraint maritalStatus) {
	}

	@Override
	public boolean isValid(String maritalStatusField, ConstraintValidatorContext cxt) {

		if (maritalStatusField.equalsIgnoreCase(env.getProperty("maritalStatus.values.married"))
				|| maritalStatusField.equalsIgnoreCase(env.getProperty("maritalStatus.values.divorced"))
				|| maritalStatusField.equalsIgnoreCase(env.getProperty("maritalStatus.values.single")))
			return true;
		else
			return false;
	}

}
