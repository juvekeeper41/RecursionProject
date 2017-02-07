package recursion.view;

import javax.swing.*;
import recursion.controller.RecursionController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private JTextArea displayArea;
	private JTextField inputField;
	private JButton fibButton, factButton;
	private SpringLayout baseLayout;
	
	public RecursionPanel(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.displayArea = new JTextArea(5, 25);
		this.baseLayout = new SpringLayout();
		this.fibButton = new JButton("Calculate Fibonacci Sequence!");
		this.factButton = new JButton("Calculate the Factorial!");
		this.inputField = new JTextField(15);
		
		
		
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(displayArea);
		this.add(inputField);
		this.add(factButton);
		this.add(fibButton);
		this.setBackground(Color.BLUE);
	}
	
	setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, displayArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, displayArea, 73, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 0, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, fibButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 0, SpringLayout.NORTH, fibButton);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, -10, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, inputField, 29, SpringLayout.SOUTH, displayArea);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -124, SpringLayout.EAST, this);
	}
	
	public void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent.click)
					{
						displayArea.setText(baseController.transferFactorial(inputField.getText()));
					}
				});
		
	}
	
}
