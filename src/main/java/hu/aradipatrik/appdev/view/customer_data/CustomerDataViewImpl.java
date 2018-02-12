package hu.aradipatrik.appdev.view.customer_data;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JDialog;
import javax.swing.JLabel;

import hu.aradipatrik.appdev.model.AddCustomerFormData;
import hu.aradipatrik.appdev.utils.ContainerUtils;

public class CustomerDataViewImpl extends JDialog implements CustomerDataView {

	private final ArrayList<CustomerDataViewListener> listeners = new ArrayList<>();
	private final JLabel nameLabel = new JLabel();
	private final JLabel ageLabel = new JLabel();
	private final JLabel genderLabel = new JLabel();
	private final JLabel granteeLabel = new JLabel();
	private final JLabel qualificationLabel = new JLabel();
	
	public CustomerDataViewImpl() {
		this.setLayout(new GridLayout(5, 1));
		ContainerUtils.addComponentsToContainer(
			this, 
			nameLabel, ageLabel, genderLabel, granteeLabel, qualificationLabel
		);
		this.setSize(600, 600);
	}
	
	@Override
	public void addListener(CustomerDataViewListener listener) {
		listeners.add(listener);
	}

	@Override
	public void setDisplayData(AddCustomerFormData formData) {
		nameLabel.setText(formData.name);
		ageLabel.setText(String.valueOf(formData.age));
		genderLabel.setText(formData.isFemale ? "Female" : "Male");
		granteeLabel.setText(formData.grantee ? "Grantee" : "No Grantee");
		qualificationLabel.setText(formData.qualification);
	}

}
