package hu.aradipatrik.appdev.service;

import hu.aradipatrik.appdev.view.add_customer.AddCustomerView;
import hu.aradipatrik.appdev.view.add_customer.AddCustomerViewImpl;
import hu.aradipatrik.appdev.view.customer_data.CustomerDataView;
import hu.aradipatrik.appdev.view.customer_data.CustomerDataViewImpl;
import hu.aradipatrik.appdev.view.main.MainView;
import hu.aradipatrik.appdev.view.main.MainViewImpl;

public class Views {
	private static MainView swingMainViewInstance;
	private static AddCustomerView swingAddCustomerViewInstance;
	private static CustomerDataView swingCustomerDataViewInstance;
	
	public static MainView getSwingMainView() {
		if (swingMainViewInstance == null) {
			swingMainViewInstance = new MainViewImpl();
			return swingMainViewInstance;
		} else {
			return swingMainViewInstance;
		}
	}
	
	public static AddCustomerView getSwingAddCustomerView() {
		if (swingAddCustomerViewInstance == null) {
			swingAddCustomerViewInstance = new AddCustomerViewImpl();
			return swingAddCustomerViewInstance;
		} else {
			return swingAddCustomerViewInstance;
		}
	}
	
	public static CustomerDataView getSwnigCustomerDataView() {
		if (swingCustomerDataViewInstance == null) {
			swingCustomerDataViewInstance = new CustomerDataViewImpl();
			return swingCustomerDataViewInstance;
		} else {
			return swingCustomerDataViewInstance;
		}
	}
}
