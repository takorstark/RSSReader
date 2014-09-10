package view;
import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.bind.JAXBException;

import model.Item;
import controller.Controller;

/**
 * GUI class is user interface for RSS Reader.
 * 
 * @author Latthapat Tangtrustham 5510547014
 * @version 2014/09/10
 *
 */
public class GUI extends JFrame {
	
	private Controller controller;
	
	private JPanel panelTop;
	private JPanel panelBottom;
	private JScrollPane scrollItem; 
	private JEditorPane editorPane;
	
	private JTextField txt;
	private JButton button1;
	private JList itemList;
	
	private List<Item> list;
	private Item[] items;
	
	private JLabel link;
	private URI uri;
	
	/**
	 * Constructor for this class.
	 */
	public GUI(){
		controller = new Controller();
		initComponents();
	
	}
	
	/**
	 * run method for GUI
	 */
	public void run(){
		pack();
		setVisible(true);	
	}

	/**
	 * initialize method
	 */
	private void initComponents(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		setTitle("RSS Reader 1.0");
		
		panelTop = new JPanel();
		panelTop.setPreferredSize(new Dimension(800, 50));
		panelTop.setLayout(new BoxLayout(panelTop, BoxLayout.X_AXIS));
		
		txt = new JTextField();
		txt.setPreferredSize(new Dimension(500, 50));
		
		
		
		button1 = new JButton("Enter");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String url = txt.getText();
				try {
					controller.setRss(url);
					list = controller.getRss().getChannel().getItem();
					items = list.toArray(new Item[list.size()]);
					afterEnter(items);
					
				} catch (JAXBException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

		});
		
		panelTop.add(txt);
		panelTop.add(button1);
		add(panelTop, BorderLayout.NORTH);
		
		panelBottom = new JPanel();
		panelBottom.setPreferredSize(new Dimension( 800, 550 ));
		panelBottom.setLayout(new BoxLayout(panelBottom, BoxLayout.X_AXIS));
		
		scrollItem = new JScrollPane();
		scrollItem.setPreferredSize(new Dimension(200, 550));
		
		editorPane = new JEditorPane();
		editorPane.setPreferredSize(new Dimension(400, 550));
		
		panelBottom.add(scrollItem);
		panelBottom.add(editorPane);
		add(panelBottom, BorderLayout.CENTER);
		
		link = new JLabel();
		link.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (Desktop.isDesktopSupported()) {
				    try {
						Desktop.getDesktop().browse(uri);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else { /* TODO: error handling */ }
				
			}
		});
		add(link, BorderLayout.SOUTH);
		
	}
	
	/**
	 * afterEnter method for create components for GUI after input link and enter pressed. 
	 * 
	 * @param item a list of item
	 */
	public void afterEnter(Item[] item){
		itemList = new JList(item);
		scrollItem.setViewportView(itemList);
		
		itemList.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				System.out.println("abc");
				Item selectedItem;
				selectedItem = (Item) itemList.getSelectedValue();
				
				editorPane.setText("== " +selectedItem.getTitle() +" ==\n\n"+ selectedItem.getDescription() 
						+"\n\n");
				
				try {
					uri = new URI(selectedItem.getLink());
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				link.setText("For more detail: " + selectedItem.getLink());
				
				
			}
		});
	}
	
	

}
