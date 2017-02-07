package recursion.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import recursion.controller.RecursionController;
import recursion.view.RecursionPanel;

public class RecursionFrame extends JFrame 
{
	private RecursionPanel basePanel;
	private RecursionController baseController;
	
	public RecursionFrame(RecursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.basePanel = new RecursionPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setTitle("Let's do math)");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
}
