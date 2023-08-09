package ex02;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String yesOrNo;
		double pi = 3.14159;
//		while(true) {
//			System.out.print("enter the value of the radius: ");
//			double radius = sc.nextDouble();
////			sc.nextLine();
//			
//			double area = pi * Math.pow(radius, 2);
//
//			System.out.printf("The area of circus is: %.4f ", area);
//			System.out.print("\n");
//			sc.nextLine();
//			System.out.println("\n\nDo you want try again ? (y/n)");
//			String teste = sc.nextLine();
//			System.out.println("\n");
//			
//			if(!(teste.toUpperCase().equals("Y"))){
//				break;
//			}
//			
//			
//			
//		}

		while (true) {

			Double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the vlaue of th radius:"));
			double area = pi * Math.pow(radius, 2);
			JOptionPane.showMessageDialog(null, String.format("The circus's area is: %.4f ", area));

			int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to try again?", "Warning",
					JOptionPane.YES_NO_OPTION);

			if (dialogResult == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "Por hoje é só pessoal !");
				break;

			}

		}

	}

}
