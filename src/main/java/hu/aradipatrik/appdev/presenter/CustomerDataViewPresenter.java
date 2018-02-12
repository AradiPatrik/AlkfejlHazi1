package hu.aradipatrik.appdev.presenter;

import hu.aradipatrik.appdev.model.AddCustomerFormData;
import hu.aradipatrik.appdev.view.customer_data.CustomerDataView;

public class CustomerDataViewPresenter implements CustomerDataView.CustomerDataViewListener {
	private CustomerDataView view;
	public CustomerDataViewPresenter(CustomerDataView view) {
		this.view = view;
		view.addListener(this);
	}
	
	public void setData(AddCustomerFormData data) {
		this.view.setDisplayData(data);
	}
	
	public void showView() {
		this.view.setVisible(true);
	}
	
	public void hideView() {
		this.view.setVisible(false);
	}
}
