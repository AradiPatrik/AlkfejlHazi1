package hu.aradipatrik.appdev.presenter;

import hu.aradipatrik.appdev.service.Views;
import hu.aradipatrik.appdev.view.main.MainView;

public class MainViewPresenter implements MainView.MainViewListener {

	private MainView mainView;
	private AddCustomerViewPresenter addCustomerViewPresenter;
	
	public MainViewPresenter(MainView mainView) {
		this.mainView = mainView;
		mainView.addListener(this);
		this.addCustomerViewPresenter = new AddCustomerViewPresenter(Views.getSwingAddCustomerView());
	}
	
	@Override
	public void onAddCustomerButtonClick() {
		this.addCustomerViewPresenter.showView();
	}

}
