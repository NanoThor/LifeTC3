package com.nanothor.lifetc3.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.print.attribute.standard.MediaSize.ISO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rtextarea.RTextScrollPane;
import org.jdesktop.swingx.JXMultiSplitPane;
import org.jdesktop.swingx.multisplitpane.DefaultSplitPaneModel;

import com.github.nanothor.grammar.LifeTC3GrammarLexer;
import com.github.nanothor.grammar.LifeTC3GrammarParser;
import com.github.nanothor.grammar.LifeTC3GrammarParser.ProgContext;
import com.github.nanothor.lifetc3.AstGen;
import com.nanothor.lifetc3.core.controllers.AnalisysController;
import com.nanothor.lifetc3.ui.utils.ANTLRTokenMaker;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import javax.swing.JTextArea;

public class Main {

	protected static final boolean debug = true;
	private JFrame frame;
	private JPanel lower_panel;
	private AnalisysController analisysController;
	private TreeViewerPanel treeViewerPanel;
	private RSyntaxTextArea textArea;
	private JTextArea compiledCodeTextArea;

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

		JButton btnSpace = new JButton("COMPILE");
		btnSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				compile();
			}
		});
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

		JPanel code_panel = new JPanel();
		tabbedPane.addTab("Console", null, code_panel, null);
		code_panel.setLayout(new BorderLayout(0, 0));
		
		compiledCodeTextArea = new JTextArea();
		JScrollPane codeScrollPane = new JScrollPane(compiledCodeTextArea);
		code_panel.add(codeScrollPane);
		

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
			public void keyReleased(KeyEvent event) {
				super.keyReleased(event);
				if (debug) {
					System.out.println("Tecla: " + event.getKeyChar());
					System.out.println(textArea.getText());
				}
				updateTreeView();
			}
		});

		AbstractTokenMakerFactory tFactory = (AbstractTokenMakerFactory) TokenMakerFactory.getDefaultInstance();
		tFactory.putMapping("Demo", ANTLRTokenMaker.class.getCanonicalName());
		TokenMakerFactory.setDefaultInstance(tFactory);

		textArea.setSyntaxEditingStyle("Demo");
		textArea.setCloseCurlyBraces(true);
		textArea.setBracketMatchingEnabled(true);
		textArea.setCodeFoldingEnabled(true);
		RTextScrollPane sp = new RTextScrollPane(textArea);

		JPanel tree_panel = new JPanel();
		center_panel.setLayout(new BorderLayout(0, 0));
		tree_panel.setLayout(new BorderLayout(0, 0));

		treeViewerPanel = new TreeViewerPanel(
				AnalisysController.getInstance().getCompleteParserTreeViewer(textArea.getText()));

		tree_panel.add(new JScrollPane(treeViewerPanel));

		JSplitPane splitPane_1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, sp, tree_panel);
		center_panel.add(splitPane_1);

	}

	private void updateTreeView() {
		if (debug) {
			System.out.println("KeyTyped");
			System.out.println(textArea.getText());
		}
		AnalisysController analisysController = AnalisysController.getInstance();
		try {
			treeViewerPanel.updateTree(analisysController.getCompleteParserTreeViewer(textArea.getText()));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	private void compile(){
		
		AnalisysController analisysController = AnalisysController.getInstance();
		analisysController.setTextInput(textArea.getText());
		ParseTreeWalker walker = new ParseTreeWalker();
		AstGen astGen = new AstGen();
		ParseTree tree = analisysController.getParser().prog();

		try {
			walker.walk(astGen, tree);
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			PrintStream ps = new PrintStream(baos);
			
			((ProgContext) tree).n.visit(ps);
			
			String code = baos.toString("UTF8");
			
			compiledCodeTextArea.setText(code);
			
			System.out.println(code);
			
		} catch (RuntimeException | UnsupportedEncodingException e) {
			System.err.println(e.getMessage());
			e.printStackTrace(System.out);
		}
	}
	
}
