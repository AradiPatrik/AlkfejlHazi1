package hu.aradipatrik.appdev.service.form_validation;

import hu.aradipatrik.appdev.model.AddCustomerFormData;
import hu.aradipatrik.appdev.service.form_validation.exception.EmptyInputException;
import hu.aradipatrik.appdev.service.form_validation.exception.InvalidGenderException;

public class FormValidationService {
	public void validateAddCustomerFormData(AddCustomerFormData formData)
			throws InvalidGenderException, EmptyInputException {
		if (formData.isFemale == formData.isMale) {
			throw new InvalidGenderException();
		}
		if (formData.name.equals("")) {
			throw new EmptyInputException();
		}
		if (formData.age == 0) {
			throw new EmptyInputException();
		}
	}
}
