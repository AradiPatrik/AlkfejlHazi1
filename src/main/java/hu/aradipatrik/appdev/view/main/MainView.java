package hu.aradipatrik.appdev.view.main;

public interface MainView {
	interface MainViewListener {
		void onAddCustomerButtonClick();
	}
	
	void addListener(MainViewListener listener);
	
}
