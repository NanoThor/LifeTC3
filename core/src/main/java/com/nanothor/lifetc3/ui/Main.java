package com.nanothor.lifetc3.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rtextarea.RTextScrollPane;
import org.jdesktop.swingx.JXMultiSplitPane;
import org.jdesktop.swingx.multisplitpane.DefaultSplitPaneModel;

import com.nanothor.lifetc3.core.controllers.AnalisysController;

public class Main {

	private JFrame frame;
	private JPanel lower_panel;
	private AnalisysController analisysController;
	private TreeViewerPanel treeViewerPanel;
	private RSyntaxTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel main_panel = new JPanel();
		frame.getContentPane().add(main_panel, BorderLayout.CENTER);

		JPanel left_panel = new JPanel();
		left_panel.setLayout(new BorderLayout(0, 0));

		JButton btnSpace = new JButton("SPACE");
		left_panel.add(btnSpace);

		JPanel center_panel = new JPanel();
		main_panel.setLayout(new BorderLayout(0, 0));

		lower_panel = new JPanel();
		main_panel.setLayout(new BorderLayout(0, 0));

		JPanel top_panel = new JPanel();
		main_panel.add(top_panel, BorderLayout.NORTH);
		top_panel.setLayout(new BorderLayout(0, 0));

		JMenuBar menuBar = new JMenuBar();
		top_panel.add(menuBar, BorderLayout.NORTH);

		JXMultiSplitPane splitPane = new JXMultiSplitPane();
		splitPane.setModel(new DefaultSplitPaneModel());
		splitPane.add(left_panel, DefaultSplitPaneModel.LEFT);
		splitPane.add(center_panel, DefaultSplitPaneModel.TOP);
		splitPane.add(lower_panel, DefaultSplitPaneModel.BOTTOM);
		lower_panel.setLayout(new BorderLayout(0, 0));

		JPanel lower_content_panel = new JPanel();
		lower_panel.add(lower_content_panel);
		lower_content_panel.setLayout(new BorderLayout(0, 0));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		lower_content_panel.add(tabbedPane, BorderLayout.CENTER);

		JPanel console_panel = new JPanel();
		tabbedPane.addTab("Console", null, console_panel, null);

		JPanel erros_panel = new JPanel();
		tabbedPane.addTab("Errors", null, erros_panel, null);

		main_panel.add(splitPane, BorderLayout.CENTER);

		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);

		JMenu mnAbout = new JMenu("About");
		menuBar.add(mnAbout);

		textArea = new RSyntaxTextArea(20, 60);
		textArea.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
				updateTreeView();
			}
		});

		AbstractTokenMakerFactory tFactory = (AbstractTokenMakerFactory) TokenMakerFactory
				.getDefaultInstance();
		tFactory.putMapping("Demo",
				"com.nanothor.lifetc3.ui.utils.ANTLRTokenMaker");
		TokenMakerFactory.setDefaultInstance(tFactory);
//		textArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);

		textArea.setSyntaxEditingStyle("Demo");
		textArea.setCloseCurlyBraces(true);
		textArea.setBracketMatchingEnabled(true);
		textArea.setCodeFoldingEnabled(true);
		RTextScrollPane sp = new RTextScrollPane(textArea);

		JPanel tree_panel = new JPanel();
		center_panel.setLayout(new BorderLayout(0, 0));
		tree_panel.setLayout(new BorderLayout(0, 0));
		
		treeViewerPanel = new TreeViewerPanel(analisysController.getInstance().getCompleteParserTreeViewer(textArea.getText()));
		
		tree_panel.add(treeViewerPanel);

		JSplitPane splitPane_1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				sp, tree_panel);
		center_panel.add(splitPane_1);
		
	}
	
	private void updateTreeView(){
		System.out.println("KeyTyped");
		System.out.println(textArea.getText());
		AnalisysController analisysController = AnalisysController.getInstance();
		try {
			treeViewerPanel.updateTree(analisysController.getCompleteParserTreeViewer(textArea.getText()));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
}
