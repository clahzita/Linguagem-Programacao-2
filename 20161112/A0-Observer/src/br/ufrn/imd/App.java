package br.ufrn.imd;

import br.ufrn.imd.gui.Window;

public class App {
	
	

	public static void main(String[] args) {
		ConsoleObserver observer1 = new ConsoleObserver();
		WeatherForecast.getInstance().registerObserver(observer1);
		
		Window window = new Window("Temperatura", 300, 150);
		window.show();

	}

}
