package hu.aradipatrik.appdev.service;

import hu.aradipatrik.appdev.service.form_validation.FormValidationService;

public class Services {
	private static FormValidationService formValidationServiceInstance;
	public static FormValidationService getFormValidator() {
		if (formValidationServiceInstance == null) {
			formValidationServiceInstance = new FormValidationService();
			return formValidationServiceInstance;
		} else {
			return formValidationServiceInstance;
		}
	}
}
