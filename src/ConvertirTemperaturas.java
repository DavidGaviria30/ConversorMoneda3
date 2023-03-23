import javax.swing.JOptionPane;

public class ConvertirTemperaturas {
	
	public void ConvertirCelsiusAKelvin(double valor) {
		double TempKelvin = valor + 273.15;
		TempKelvin = (double) Math.round(TempKelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, "La Temperatura es " + TempKelvin + " Kelvin");

}
	
	public void ConvertirCelsiusAFahrenheit(double valor) {
		double TempFahrenheit = (valor * 9/5) + 32;
		TempFahrenheit = (double) Math.round(TempFahrenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, "La Temperatura es " + TempFahrenheit + " Fahrenheit");

}
	
	public void ConvertirKelvinACelsius(double valor) {
		double TempCelsius = valor - 273.15;
		TempCelsius = (double) Math.round(TempCelsius * 100d)/100;
		JOptionPane.showMessageDialog(null, "La Temperatura es " + TempCelsius + " Celsius");

}
	
	public void ConvertirFahrenheitACelsius(double valor) {
		double TempCelsius = (valor - 32) * 5/9;
		TempCelsius = (double) Math.round(TempCelsius * 100d)/100;
		JOptionPane.showMessageDialog(null, "La Temperatura es " + TempCelsius + " Celsius");

}
	
	public void ConvertirFahrenheitAKelvin(double valor) {
		double TempKelvin = (valor - 32) * 5/9 + 273.15;
		TempKelvin = (double) Math.round(TempKelvin * 100d)/100;
		JOptionPane.showMessageDialog(null, "La Temperatura es " + TempKelvin + " Kelvin");

}
	
	public void ConvertirKelvinAFahrenheit(double valor) {
		double TempFahrenheit = (valor * 9/5) - 459.67;
		TempFahrenheit = (double) Math.round(TempFahrenheit * 100d)/100;
		JOptionPane.showMessageDialog(null, "La Temperatura es " + TempFahrenheit + " Fahrenheit");

}
	
}
	
