package com.nanothor.lifetc3.ui;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextPane;

import org.antlr.v4.runtime.tree.gui.TreeViewer;


public class TreeViewerPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSlider slider;
	private TreeViewer treeviewer;
	/**
	 * Create the panel.
	 */
	
	public TreeViewerPanel(TreeViewer tv) {
		if(tv!=null){
			this.treeviewer = tv;
		}
		setLayout(new BorderLayout(0, 0));
		
		JTextPane logTextArea = new JTextPane();
		add(logTextArea, BorderLayout.SOUTH);
		
		slider = new JSlider();
		slider.setValue(0);
		slider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				int value = slider.getValue();
				treeviewer.setScale(value);
			}
		});
		add(slider, BorderLayout.NORTH);
		
		add(treeviewer, BorderLayout.CENTER);
	}
	
	public void updateTree(TreeViewer tv){
		this.remove(treeviewer);
		this.treeviewer = tv;
		this.add(treeviewer);
		this.revalidate();
	}
	
}
