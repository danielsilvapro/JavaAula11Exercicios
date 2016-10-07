package br.com.danielsilva;

import javax.swing.JOptionPane;

public class Divisao {

	public static void main(String args[]) {

		double dividendo, divisor;

		try {
			dividendo = Integer.parseInt(JOptionPane.showInputDialog("Informe o dividendo: "));

			divisor = Integer.parseInt(JOptionPane.showInputDialog("Informe o divisor: "));

			JOptionPane.showMessageDialog(null, dividendo / divisor);
			// break;
		} catch (ArithmeticException ae) {
			JOptionPane.showMessageDialog(null, "N�o pode dividir por 0 seu caba�o.");
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Informe um numero seu caba�o.");
		}

	}
}
