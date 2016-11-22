package br.ufrn.imd.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import br.ufrn.imd.TextObserver;
import br.ufrn.imd.WeatherForecast;

public class TextPanel extends JPanel {

	public TextPanel() {
		JTextField txtTemperature = new JTextField(20);
		txtTemperature.setEnabled(false);
		add(txtTemperature);
		
		TextObserver observer = new TextObserver(txtTemperature);
		WeatherForecast.getInstance().registerObserver(observer);
	}
}
