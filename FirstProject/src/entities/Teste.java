package entities;

import javax.swing.*;

public class Teste {
   public static void main(String[] args) {
//      JTextField wField = new JTextField(5);
//      JTextField xField = new JTextField(5);
//      JTextField yField = new JTextField(5);
//      JTextField zField = new JTextField(5);
//
//      JPanel myPanel = new JPanel();
//      myPanel.add(new JLabel("x:"));
//      myPanel.add(wField);
//      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
//      myPanel.add(new JLabel("y:"));
//      myPanel.add(xField);
//      myPanel.add(new JLabel("x:"));
//      myPanel.add(yField);
//      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
//      myPanel.add(new JLabel("y:"));
//      myPanel.add(zField);
//
//      int result = JOptionPane.showConfirmDialog(null, myPanel, 
//               "Please Enter X and Y Values", JOptionPane.OK_CANCEL_OPTION);
//      if (result == JOptionPane.OK_OPTION) {
//         System.out.println("w value: " + xField.getText());
//         System.out.println("x value: " + yField.getText());
//         System.out.println("y value: " + xField.getText());
//         System.out.println("z value: " + yField.getText());
//      }
//   }

	   JTextField w = new JTextField();
	   JTextField x = new JTextField();
	   JTextField y = new JTextField();
	   JTextField z = new JTextField();
	   
	   JTextField a = new JTextField();
	   JTextField b = new JTextField();
	   JTextField c = new JTextField();
	   JTextField d = new JTextField();
	   
	   Object[] message = {
	       "w:", w,
	       "x:", x,
	       "w:", y,
	       "x:", z
	      
	   };
	   
	   Object[] message2 = {
		       "a:", a,
		       "b:", b,
		       "c:", c,
		       "d:", d
		      
		   };
	   
	 
	   

	   int option = JOptionPane.showConfirmDialog(null, message, message2, "Login", JOptionPane.OK_CANCEL_OPTION);
//	   if (option == JOptionPane.OK_OPTION) {
//	       if (username.getText().equals("h") && password.getText().equals("h")) {
//	           System.out.println("Login successful");
//	       } else {
//	           System.out.println("login failed");
//	       }
//	   } else {
//	       System.out.println("Login canceled");
//	   }
//   
   }
}
	