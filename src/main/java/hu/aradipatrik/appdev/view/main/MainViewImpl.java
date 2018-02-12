package hu.aradipatrik.appdev.view.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainViewImpl extends JFrame implements MainView {

	private final ArrayList<MainViewListener> listeners = new ArrayList<>();
	private final JMenuBar menubar = new JMenuBar();
	private final JMenu customerMenu = new JMenu("Costumer");
	private final JMenu bookMenu = new JMenu("Book");
	private final JMenu sellMenu = new JMenu("Sell");
	private final JMenuItem addCustomerMenuItem = new JMenuItem("Add Customer");
	private final JMenuItem listCustomersMenuItem = new JMenuItem("List Costumers");
	
	public MainViewImpl() {
		setUpView();
		setUpListeners();
	}
	
	private void setUpView() {
		setLayout(new BorderLayout());
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menubar.add(customerMenu);
		menubar.add(bookMenu);
		menubar.add(sellMenu);
		
		customerMenu.add(addCustomerMenuItem);
		customerMenu.add(listCustomersMenuItem);
		
		setJMenuBar(menubar);
		setVisible(true);
	}
	
	private void setUpListeners() {
		addCustomerMenuItem.addActionListener(this::onAddCustomerButtonClicked);
	}
	
	public void addListener(MainViewListener listener) {
		listeners.add(listener);
	}
	
	public void onAddCustomerButtonClicked(ActionEvent event) {
		for (MainViewListener listener : listeners) {
			listener.onAddCustomerButtonClick();
		}
	}
	

}
