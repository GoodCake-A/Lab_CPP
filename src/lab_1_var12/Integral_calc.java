package lab_1_var12;
import java.awt.Dimension;

import javax.swing.*;


public class Integral_calc {
	public static void main(String[] args) {
		create_GUI();
	}
	
	public static void create_GUI() {
		JFrame frame = new JFrame("Расчет интеграла");
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JButton integrate_button=new JButton("Интегрировать");
		frame.add(integrate_button);
		
		frame.pack();
		frame.setVisible(true); 
	}
	

}
