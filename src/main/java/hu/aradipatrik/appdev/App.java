package hu.aradipatrik.appdev;

import hu.aradipatrik.appdev.presenter.MainViewPresenter;
import hu.aradipatrik.appdev.service.Views;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	new MainViewPresenter(Views.getSwingMainView());
    }
}
