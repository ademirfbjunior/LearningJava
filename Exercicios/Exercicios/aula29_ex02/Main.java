// Calcular a área do circulo recebendo apenas o valor do raio.
package aula29_ex02;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;

		while (true) {

			Double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the value of radius:"));
			double area = pi * Math.pow(radius, 2);
			JOptionPane.showMessageDialog(null, String.format("The circus's area is: %.4f ", area));

			int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to try again?", "Warning",
					JOptionPane.YES_NO_OPTION);

			if (dialogResult == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Por hoje é só pessoal !");
				break;

			}

		}
		
		sc.close();
	}

}

