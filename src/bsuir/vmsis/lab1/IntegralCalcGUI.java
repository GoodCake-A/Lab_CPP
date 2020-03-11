package bsuir.vmsis.lab1;

import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;


public class IntegralCalcGUI {	
	public static void createGUI() {
        JFrame frame = new JFrame("Расчет интеграла");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton integrateButton =new JButton("Интегрировать");   
        JLabel label1=new JLabel("  sin(x)dx",JLabel.LEFT);
        JLabel label2=new JLabel("  Начало интервала ",JLabel.LEFT);
        JTextField begin=new JTextField(30);
        JLabel label3=new JLabel("  Конец интервала ",JLabel.LEFT);
        JTextField end=new JTextField(30);
        JLabel label4=new JLabel("Интеграл ",JLabel.LEFT);
        JLabel integralValue=new JLabel("0",JLabel.LEFT);
        JPanel mainPanel,topPanel, middlePanel, middlePanelBegin, middlePanelEnd, bottomPanel, answerPanel;
        mainPanel=new JPanel();
        mainPanel.setLayout(null);
        topPanel=new JPanel();
        topPanel.setLayout(new BorderLayout());
        middlePanel=new JPanel();
        middlePanel.setLayout(new BorderLayout());
        middlePanelBegin=new JPanel();
        middlePanelBegin.setLayout(new BorderLayout());
        middlePanelEnd=new JPanel();
        middlePanelEnd.setLayout(new BorderLayout());
        bottomPanel=new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        answerPanel=new JPanel();
        answerPanel.setLayout(new FlowLayout());
        
        frame.add(mainPanel);
        int lineWidth=350,lineHeight=28,leftGap=5;
        mainPanel.add(topPanel);
        topPanel.setBounds(leftGap, 0, lineWidth, lineHeight);
        middlePanel.setBounds(leftGap, 0+lineHeight, lineWidth, 2*lineHeight-10);
        bottomPanel.setBounds(leftGap, 0+3*lineHeight, lineWidth, lineHeight+10);
        mainPanel.add(middlePanel);
        mainPanel.add(bottomPanel);
        middlePanel.add(middlePanelBegin, BorderLayout.NORTH);
        middlePanel.add(middlePanelEnd, BorderLayout.SOUTH);
        topPanel.add(label1, BorderLayout.WEST);
        middlePanelBegin.add(label2, BorderLayout.WEST);
        middlePanelBegin.add(begin, BorderLayout.CENTER);
        middlePanelEnd.add(label3, BorderLayout.WEST);
        middlePanelEnd.add(end, BorderLayout.CENTER);
        bottomPanel.add(answerPanel,BorderLayout.WEST);
        answerPanel.add(integrateButton,FlowLayout.LEFT);
        answerPanel.add(integralValue,FlowLayout.LEFT);
        answerPanel.add(label4,FlowLayout.LEFT);
        frame.setSize(new Dimension(lineWidth+40, lineHeight*4+50));
        frame.setResizable(false);
        frame.setVisible(true);  
        
        integrateButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent event) {
        		try {
	        		double answer=0;
	        		answer=IntegralCalc.calculateIntegral(Double.parseDouble(begin.getText()),Double.parseDouble(end.getText()),10000000);
	        		integralValue.setText(Double.toString(answer));
        		}
        		catch(NumberFormatException exeption) {
        			integralValue.setText("Некорректный интервал");
        		}
        	}
        });
	}
	
}

