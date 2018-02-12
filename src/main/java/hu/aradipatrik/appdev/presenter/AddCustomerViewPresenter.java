package hu.aradipatrik.appdev.presenter;

import hu.aradipatrik.appdev.model.AddCustomerFormData;
import hu.aradipatrik.appdev.service.Services;
import hu.aradipatrik.appdev.service.Views;
import hu.aradipatrik.appdev.service.form_validation.exception.EmptyInputException;
import hu.aradipatrik.appdev.service.form_validation.exception.InvalidGenderException;
import hu.aradipatrik.appdev.view.add_customer.AddCustomerView;

public class AddCustomerViewPresenter implements AddCustomerView.AddCustomerViewListener {
	private AddCustomerView addCustomerView;
	private CustomerDataViewPresenter customerDataViewPresenter;
	
	public AddCustomerViewPresenter(AddCustomerView addCustomerView) {
		this.addCustomerView = addCustomerView;
		this.addCustomerView.addListener(this);
		this.customerDataViewPresenter = new CustomerDataViewPresenter(Views.getSwnigCustomerDataView());
	}

	@Override
	public void onOkButtonClick(AddCustomerFormData formData) {
		try {			
			validateFormData(formData);
			hideView();
			this.customerDataViewPresenter.setData(formData);
			this.customerDataViewPresenter.showView();
		} catch (InvalidGenderException ex) {
			System.out.println("Invalid gender");
		} catch (EmptyInputException ex) {
			System.out.println("Empty input");
		}
	}
	
	private void validateFormData(AddCustomerFormData formData) 
			throws InvalidGenderException, EmptyInputException {
		Services.getFormValidator().validateAddCustomerFormData(formData);
	}

	@Override
	public void onCancelButtonClick() {
		hideView();
	}
	
	public void showView() {
		if (this.addCustomerView != null) {
			this.addCustomerView.setVisible(true);
		}
	}
	
	public void hideView() {
		if (this.addCustomerView != null) {
			this.addCustomerView.setVisible(false);
		}
	}
	
}
