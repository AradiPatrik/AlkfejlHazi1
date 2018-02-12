package hu.aradipatrik.appdev.view.add_customer;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import hu.aradipatrik.appdev.model.AddCustomerFormData;
import hu.aradipatrik.appdev.utils.ContainerUtils;

public class AddCustomerViewImpl extends JDialog implements AddCustomerView {

	private final ArrayList<AddCustomerViewListener> listeners = new ArrayList<>();
	private final JPanel formPanel = new JPanel();
	private final JPanel buttonsPanel = new JPanel();
	private final JPanel gendersPanel = new JPanel();
	private final JLabel nameLabel = new JLabel("Name");
	private final JTextField nameTextField = new JTextField();
	private final JLabel ageLabel = new JLabel("Age");
	private final JSpinner ageSpinner = new JSpinner();
	private final JLabel genderLabel = new JLabel();
	private final JRadioButton femaleRadioButton = new JRadioButton("Female");
	private final JRadioButton maleRadioButton = new JRadioButton("Male");
	private final JLabel granteeLable = new JLabel("Grantee");
	private final JCheckBox granteeCheckBox = new JCheckBox();
	private final JLabel qualificationLable = new JLabel("Qualification");
	private final JComboBox<String> qualificationComboBox = new JComboBox<>(new String[] {
			"University", "Primary School", "High School"
	});
	private final JButton okButton = new JButton("Ok");
	private final JButton cancelButton = new JButton("Cancel");
	
	public AddCustomerViewImpl() {
		setLayout(new BorderLayout());
		setSize(600, 600);
		
		formPanel.setLayout(new GridLayout(5, 2));
		buttonsPanel.setLayout(new FlowLayout());
		gendersPanel.setLayout(new FlowLayout());
		
		add(formPanel, BorderLayout.CENTER);
		add(buttonsPanel, BorderLayout.SOUTH);
		
		ContainerUtils.addComponentsToContainer(
			formPanel,
			nameLabel, 				nameTextField,
			ageLabel, 				ageSpinner,
			genderLabel, 			gendersPanel,
			granteeLable, 			granteeCheckBox,
			qualificationLable, 	qualificationComboBox
		);
		
		ContainerUtils.addComponentsToContainer(
			buttonsPanel,
			okButton, cancelButton
		);
		
		ContainerUtils.addComponentsToContainer(
			gendersPanel,
			femaleRadioButton, maleRadioButton
		);
		
		pack();
		
		okButton.addActionListener(this::onOkButtonClick);
		cancelButton.addActionListener(this::onCancelButtonClick);
	}
	
	@Override
	public void addListener(AddCustomerViewListener listener) {
		listeners.add(listener);
	}
	
	private void onOkButtonClick(ActionEvent e) {
		for (AddCustomerViewListener listener : listeners) {
			listener.onOkButtonClick(getCustomerData());
		}
	}
	
	private AddCustomerFormData getCustomerData() {
		return new AddCustomerFormData(
			nameTextField.getText(),
			(Integer)ageSpinner.getValue(),
			maleRadioButton.isSelected(),
			femaleRadioButton.isSelected(),
			granteeCheckBox.isSelected(),
			(String)qualificationComboBox.getSelectedItem()
		);
	}
	
	private void onCancelButtonClick(ActionEvent e) {
		for (AddCustomerViewListener listener : listeners) {
			listener.onCancelButtonClick();
		}
	}
	
}
