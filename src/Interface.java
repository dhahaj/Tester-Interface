import javax.swing.JPopupMenu.Separator;
import java.awt.*;
import javax.swing.*;

public class Interface extends JFrame {

	public Interface() {
		initialize();
	}

	private static final long serialVersionUID = 1L;

	private Panel panel;
	private Scrollbar scrollbar1;
	private ScrollPane scrollPane1;
	private Button progButton;
	private Button testButton;
	private JLabel jDeviceLabel;
	private JLabel jUserInfoLabel;
	private JScrollPane jScrollPane1;
	private JTextArea jTextArea;
	private JMenuBar mainMenuBar;
	private JMenu jMenuFile;
	private MenuItem jMenuItemLogout;
	private Separator jSeparator1;
	private MenuItem jMenuItemQuit;
	private JMenu jMenuEdit;
	private MenuItem jMenuItemAdvanced;
	private JMenu jMenuDevice;
	private JMenu jMenuV40;
	private MenuItem jMenuItemEAX300;
	private JMenu jMenuEAX2500;
	private JMenu jMenuEAX500;
	private MenuItem jMenuItemEAX3500;
	private JMenu jMenuAbout;
	private MenuItem jMenuItemVersion;
	private MenuItem jMenuItemChangelog;
	private MenuItem jMenuItemClearScreen;

	private void initialize() {
		panel = new java.awt.Panel();
		scrollbar1 = new java.awt.Scrollbar();
		scrollPane1 = new java.awt.ScrollPane();
		jMenuItemClearScreen = new MenuItem("Clear Screen");
		progButton = new Button("Program");
		testButton = new Button("Test");
		jDeviceLabel = new javax.swing.JLabel();
		jUserInfoLabel = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea = new javax.swing.JTextArea();
		mainMenuBar = new javax.swing.JMenuBar();
		jMenuFile = new javax.swing.JMenu();
		jMenuItemLogout = new MenuItem("Logout");
		jSeparator1 = new javax.swing.JPopupMenu.Separator();
		jMenuItemQuit = new MenuItem("Quit");
		jMenuEdit = new javax.swing.JMenu();
		jMenuItemAdvanced = new MenuItem("Advanced");
		jMenuDevice = new javax.swing.JMenu();
		jMenuItemEAX300 = new MenuItem("EAX300");
		jMenuV40 = new javax.swing.JMenu();
		jMenuEAX2500 = new javax.swing.JMenu();
		jMenuEAX500 = new javax.swing.JMenu();
		jMenuItemEAX3500 = new MenuItem("EAX3500");
		jMenuAbout = new javax.swing.JMenu();
		jMenuItemVersion = new MenuItem("Version");
		jMenuItemChangelog = new MenuItem("ChangeLog");

		scrollbar1.setBackground(new java.awt.Color(240, 240, 240));
		scrollPane1.setBackground(java.awt.Color.lightGray);
		scrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.N_RESIZE_CURSOR));

		scrollPane1.addInputMethodListener(new java.awt.event.InputMethodListener() {
			public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
				scrollPane1CaretPositionChanged(evt);
			}

			public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
			}
		});

		org.jdesktop.layout.GroupLayout panelLayout = new org.jdesktop.layout.GroupLayout(panel);
		panel.setLayout(panelLayout);
		panelLayout.setHorizontalGroup(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(
				org.jdesktop.layout.GroupLayout.TRAILING,
				panelLayout.createSequentialGroup().add(0, 0, Short.MAX_VALUE).add(scrollbar1,
						org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
						org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
				.add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
						.add(org.jdesktop.layout.GroupLayout.TRAILING,
								panelLayout
										.createSequentialGroup().add(scrollPane1,
												org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
										.addContainerGap())));
		panelLayout.setVerticalGroup(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(org.jdesktop.layout.GroupLayout.TRAILING, scrollbar1,
						org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
				.add(panelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(scrollPane1,
						org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Tester Interface v7.0");
		setBackground(java.awt.Color.orange);
		setMinimumSize(new java.awt.Dimension(500, 600));

		progButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		progButton.setToolTipText("Press to begin programming a device");
		progButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		progButton.setBorderPainted(false);
		// progButton.setEnabled(false);
		progButton.setIconTextGap(2);

		testButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		testButton.setToolTipText("Click to begin testing the device");
		testButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		testButton.setBorderPainted(false);
		// testButton.setEnabled(false);
		testButton.setIconTextGap(6);

		// jDeviceLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jDeviceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
		jDeviceLabel.setText("No Device Selected");
		jDeviceLabel.setToolTipText("Select a device");

		jUserInfoLabel.setBackground(java.awt.SystemColor.windowText);
		jUserInfoLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
		jUserInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jUserInfoLabel.setText("Username");
		jUserInfoLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

		jTextArea.setEditable(false);
		jTextArea.setBackground(new java.awt.Color(51, 153, 255));
		jTextArea.setColumns(15);
		jTextArea.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
		jTextArea.setForeground(new java.awt.Color(255, 255, 255));
		jTextArea.setLineWrap(true);
		jTextArea.setRows(5);
		jTextArea.setText(
				"TODO: Load testing setup instructions here...\n\nBlah\nBlah\nBlah\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nBLAH!!");
		jTextArea.setToolTipText("");
		jTextArea.setWrapStyleWord(true);
		jTextArea.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jScrollPane1.setViewportView(jTextArea);

		// Add the file menu to the menubar
		jMenuFile.setText("File");
		jMenuFile.add(jMenuItemLogout);
		jMenuFile.add(jSeparator1);
		jMenuFile.add(jMenuItemQuit);
		mainMenuBar.add(jMenuFile);

		// Add the edit menu to the menubar
		jMenuEdit.setText("Edit");
		jMenuEdit.add(jMenuItemAdvanced);
		jMenuItemClearScreen.setText("Clear Screen");
		jMenuEdit.add(jMenuItemClearScreen);
		mainMenuBar.add(jMenuEdit);

		// Add the device menu to the menubar
		jMenuDevice.setText("Devices");
		jMenuDevice.add(jMenuItemEAX300);
		jMenuV40.setText("V40");
		populateV40Menu();
		jMenuDevice.add(jMenuV40);
		jMenuEAX2500.setText("EAX2500");
		jMenuDevice.add(jMenuEAX2500);
		jMenuEAX500.setText("EAX500");
		jMenuDevice.add(jMenuEAX500);
		jMenuItemEAX3500.setText("EAX3500");
		jMenuDevice.add(jMenuItemEAX3500);
		mainMenuBar.add(jMenuDevice);

		// Add the about menu to the menubar
		jMenuAbout.setText("Help");
		jMenuAbout.add(jMenuItemVersion);
		jMenuAbout.add(jMenuItemChangelog);
		jMenuAbout.setVisible(true);
		mainMenuBar.add(jMenuAbout);

		setJMenuBar(mainMenuBar);

		org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
				.add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup().addContainerGap()
						.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING).add(jScrollPane1)
								.add(layout.createSequentialGroup()
										.add(progButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 128,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
										.add(testButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 123,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 45, Short.MAX_VALUE)
										.add(jDeviceLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED).add(jUserInfoLabel,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 129,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
				.add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup().addContainerGap()
						.add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
						.addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
						.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
								.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
										.add(progButton).add(testButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE,
												53, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
								.add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
										.add(jDeviceLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
										.add(jUserInfoLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 53,
												org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap()));

		layout.linkSize(new java.awt.Component[] { jDeviceLabel, jUserInfoLabel },
				org.jdesktop.layout.GroupLayout.VERTICAL);

		layout.linkSize(new java.awt.Component[] { progButton, testButton }, org.jdesktop.layout.GroupLayout.VERTICAL);

		pack();
	}

	private void populateV40Menu() {
		// TODO: add v40 variants to the submenu
	}

	private void scrollPane1CaretPositionChanged(java.awt.event.InputMethodEvent evt) {// GEN-FIRST:event_scrollPane1CaretPositionChanged
		// TODO add your handling code here:
	} // GEN-LAST:event_scrollPane1CaretPositionChanged

	public void appendText(StringBuilder stringBuilder) {
		System.out.println(jTextArea.getText().length());
		if (jTextArea.getText().length() != 0)
			stringBuilder.insert(0, "\n");
		jTextArea.append(stringBuilder.toString());
	}

	public void clearText() {
		jTextArea.setText("");
	}

	public static void main(String[] args) {

	}

}
