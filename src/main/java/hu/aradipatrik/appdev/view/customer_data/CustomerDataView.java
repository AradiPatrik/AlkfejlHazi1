package hu.aradipatrik.appdev.view.customer_data;

import hu.aradipatrik.appdev.model.AddCustomerFormData;

public interface CustomerDataView {
	interface CustomerDataViewListener {
		
	}
	
	void addListener(CustomerDataViewListener listener);
	void setDisplayData(AddCustomerFormData formData);
	void setVisible(boolean visible);
}
