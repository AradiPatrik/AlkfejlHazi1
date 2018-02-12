package hu.aradipatrik.appdev.view.add_customer;

import hu.aradipatrik.appdev.model.AddCustomerFormData;

public interface AddCustomerView {
	interface AddCustomerViewListener {
		void onOkButtonClick(AddCustomerFormData formData);
		void onCancelButtonClick();
	}
	
	void setVisible(boolean visible);
	void addListener(AddCustomerViewListener listener);
}
