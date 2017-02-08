import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.FlowLayout;

public class MyJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JPanel contentPane = new JPanel();

	/*
	 * public static void main(String[] args) {
	 * 
	 * EventQueue.invokeLater(new Runnable() { public void run() { try {
	 * MyJFrame frame = new MyJFrame(); JMenuBar bar = new JMenuBar();
	 * 
	 * MenuItem itemLogout = new MenuItem("Logout"); JMenu jMenuFile = new
	 * JMenu("File"); jMenuFile.add(itemLogout);
	 * 
	 * contentPane.add(itemLogout);
	 * 
	 * frame.setJMenuBar(bar); bar.setVisible(true); Button button = new
	 * Button("Test"), pButton = new Button("Program");
	 * 
	 * contentPane.setLayout(contentPane.getLayout()); button.setSize(50, 50);
	 * pButton.setSize(50, 50); frame.getContentPane().add(button);
	 * frame.getContentPane().add(pButton); frame.getContentPane().add(bar); //
	 * frame.pack(); frame.setVisible(true); } catch (Exception e) {
	 * e.printStackTrace(); } } }); }
	 */

	/**
	 * Create the frame.
	 */
	public MyJFrame() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.out.println(arg0.paramString());
				SwingUtilities.invokeLater(new Runnable() {

					@Override
					public void run() {
						JDialog.setDefaultLookAndFeelDecorated(true);
					}
				});
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 772, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

}
