package be.appfoundry.simplecalculator;

import be.appfoundry.simplecalculatorplugin.PluginService;

public class AddPlugin extends PluginService {

	@Override
	protected double getResult(double number1, double number2) {
		return number1 + number2;
	}

}
