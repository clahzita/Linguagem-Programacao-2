package br.ufrn.imd;

import java.awt.TextField;

import javax.swing.JTextField;

public class TextObserver implements Observer{

	private JTextField txtTemperature;
	
	public TextObserver(JTextField txtTemperature) {
		this.txtTemperature = txtTemperature;
	}
	
	
	@Override
	public void update(Subject subject) {
		WeatherForecast wf = (WeatherForecast) subject;
		txtTemperature.setText(""+wf.getTemperature());
		
	}
		

}