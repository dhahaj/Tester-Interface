import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import static java.lang.System.out;

public class Button extends JButton {

	private static final long serialVersionUID = 1L;

	/**
	 * Default Constructor
	 * 
	 * @param name The label for the button.
	 */
	public Button(String name) {
		this.setText(name);
		this.addActionListener(new ButtonListener());
		this.setEnabled(true);
		this.setVisible(true);
	}

	/**
	 * Inner class to handle button action events
	 * 
	 * @author dmh
	 */
	class ButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			out.println(e.getActionCommand());
		}
	}

}
