package recursion.view;

import javax.swing.JFrame;
import java.awt.Dimension;
import recursion.controller.RecursionController;
import recursion.view.RecursionPanel;

public class RecursionFrame extends JFrame 
{
	private recursionPanel appPanel;
	private RecursionController baseController;
	
	public recursionFrame(recursionController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new recursionPanel(baseController);
	}
}
