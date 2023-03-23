import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosADolares(double valor) {
		double monedaDolar = valor / 4764.71;
		monedaDolar = (double) Math.round(monedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaDolar + " Dolares");
	}
	
	public void ConvertirPesosAEuros(double valor) {
		double monedaEuro = valor / 5134.22;
		monedaEuro = (double) Math.round(monedaEuro * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaEuro + " Euros");
	}
	
	public void ConvertirPesosALibras(double valor) {
		double monedaLibra = valor / 5909.88;
		monedaLibra = (double) Math.round(monedaLibra * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaLibra + " Libras");
	}
	
	public void ConvetirPesosAYen(double valor) {
		double monedaYen = valor / 36.87;
		monedaYen = (double) Math.round(monedaYen * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaYen + " Yenes");
	}
	
	public void ConvertirPesosAWonCoreano(double valor) {
		double monedaWon = valor / 3.70;
		monedaWon = (double) Math.round(monedaWon * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaWon + " Wons");
	}
	
	public void ConvertirDolarAPesos(double valor) {
		double monedaPesos = valor * 4764.71;
		monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " Pesos");
	}
	
	public void ConvertirEurosAPesos(double valor) {
		double monedaPesos = valor * 5134.22;
		monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " Pesos");
	}
	
	public void ConvertirLibrasAPesos(double valor) {
		double monedaPesos = valor * 55909.88;
		monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " Pesos");
	}
	
	public void ConvertirYenAPesos(double valor) {
		double monedaPesos = valor * 36.87;
		monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " Pesos");
	}
	
	public void ConvertirWonCoreanoAPesos(double valor) {
		double monedaPesos = valor * 3.70;
		monedaPesos = (double) Math.round(monedaPesos * 100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $" + monedaPesos + " Pesos");
	}
	
	
	
	
	
	
	
	
	
	
	
}
