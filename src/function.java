import javax.swing.JOptionPane;

public class function {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirTemperaturas temperaturas = new ConvertirTemperaturas();

	/*ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();*/
	
	
	public void ConvertirMonedas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elija la moneda a la que desea convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Col-pesos a Dolar", "De Col-pesos a Euros", "De Col-pesos a Libras", "De Col-pesos a Yen", "De Col-pesos a Won Coreano", "De Dolar a Col-pesos", "De Euros a Col-pesos", "De Libras a Col-pesos", "De Yen a Col-pesos", "De Won Coreano a Col-pesos" }, "Seleccion")).toString();
		
		switch(opcion) {
		case "De Col-pesos a Dolar":
			monedas.ConvertirPesosADolares(Minput);
			break;
		case "De Col-pesos a Euros":
			monedas.ConvertirPesosAEuros(Minput);
			break;
		case "De Col-pesos a Libras":
			monedas.ConvertirPesosALibras(Minput);
			break;
		case "De Col-pesos a Yen":
			monedas.ConvetirPesosAYen(Minput);
			break;
		case "De Col-pesos a Won Coreano":
			monedas.ConvertirPesosAWonCoreano(Minput);
			break;
		case "De Dolar a Col-pesos":
			monedas.ConvertirDolarAPesos(Minput);
			break;
		case "De Euros a Col-pesos":
			monedas.ConvertirEurosAPesos(Minput);
			break;
		case "De Libras a Col-pesos":
			monedas.ConvertirLibrasAPesos(Minput);
			break;
		case "De Yen a Col-pesos":
			monedas.ConvertirYenAPesos(Minput);
			break;
		case "De Won Coreano a Col-pesos":
			monedas.ConvertirWonCoreanoAPesos(Minput);
			break;
			
		}
	}
	
	
	public void ConvertirTemperaturas(double Minput) {
		String opcion = (JOptionPane.showInputDialog(null, "Elija la Temperatura a la que desea convertir", "Temperaturas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Celsius a Kelvin", "De Celsius a Fahrenheit", "De Kelvin a Celsius", "De Fahrenheit a Celsius", "De Fahrenheit a Kelvin", "De Kelvin a Fahrenheit" }, "Seleccion")).toString();
		
		switch(opcion) {
		case "De Celsius a Kelvin":
			temperaturas.ConvertirCelsiusAKelvin(Minput);
			break;
		case "De Celsius a Fahrenheit":
			temperaturas.ConvertirCelsiusAFahrenheit(Minput);
			break;
		case "De Kelvin a Celsius":
			temperaturas.ConvertirKelvinACelsius(Minput);
			break;
		case "De Fahrenheit a Celsius":
			temperaturas.ConvertirFahrenheitACelsius(Minput);
			break;
		case "De Fahrenheit a Kelvin":
			temperaturas.ConvertirFahrenheitAKelvin(Minput);
			break;
		case "De Kelvin a Fahrenheit":
			temperaturas.ConvertirKelvinAFahrenheit(Minput);
			break;
		
			
		}
	}

}
