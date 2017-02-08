import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;
import static java.lang.System.out;

public class MenuItem extends JMenuItem {

	private static final long serialVersionUID = 1L;

	public MenuItem(String name) {
		super();
		this.setVisible(true);
		this.setEnabled(true);
		this.setText(name);
		this.addActionListener(new MenuItemActionListener());
	}

	class MenuItemActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			out.println(e.getActionCommand());
			StringBuilder stringBuilder = new StringBuilder(e.getActionCommand());
			TesterMain.gui.appendText(stringBuilder);
			handleEvents(e);
		}

		private void handleEvents(ActionEvent e) {
			String source = e.getActionCommand();
			if (source.equalsIgnoreCase("quit")) {
				TesterMain.gui.dispose();
				System.exit(0);
			} else if (source.equalsIgnoreCase("logout")) {
				// TODO: handle logout events
			} else if (source.equalsIgnoreCase("advanced")) {
				// TODO: show the advanced action popup dialog
			} else if (source.contains("Clear")) {
				TesterMain.gui.clearText();
			}
		}

	}

}
