package pack;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;



import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import java.awt.Point;

public class Table extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JButton jButton = null;
	private JScrollPane jScrollPane = null;
	private static JTable jTable = null;
	private JLabel jLabel = null;
	private JTextField jTextField = null;
	public static int l=0;
	 

	/**
	 * This is the default constructor
	 * @throws UnsupportedLookAndFeelException 
	 */
	public Table()  {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize()  {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException e) {e.printStackTrace();}
		catch (InstantiationException e) {e.printStackTrace();} 
		catch (IllegalAccessException e) {e.printStackTrace();} 
		catch (UnsupportedLookAndFeelException e) {e.printStackTrace();}
		//this.setDefaultLookAndFeelDecorated(true);
		this.setSize(409, 366);
		this.setLocation(new Point(400, 400));
		this.setResizable(false);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.setContentPane(getJContentPane());
		this.setTitle("les regles de reécriture");
		this.setVisible(true);
		this.setLocation(300, 220);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(11, 9, 98, 16));
			jLabel.setText("le terme initial");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJButton(), null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(jLabel, null);
			jContentPane.add(getJTextField(), null);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(129, 283, 104, 24));
			jButton.setText("ok");
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					
					
					while(jTable.getValueAt(l, 0)!=null)
					
					{
						
							l=l+1;
					}
					
					String [][]s=new String[l][3];
					for(int i=0;i<l;i++)
						for(int j=0;j<jTable.getColumnCount();j++){
							s[i][j]=(String) jTable.getValueAt(i, j);
						}
					Secondmain sm=new Secondmain();
					dispose();
					sm.setArray(s,jTextField.getText());
					sm.main(null);
					
					
				}
				});
		
		}
		return jButton;
		}


	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane(getJTable());
			getJTable().setFillsViewportHeight(true);
			jScrollPane.setBounds(new Rectangle(25, 40, 350, 220));
			//jScrollPane.setViewportView(getJTable());
		}
		return jScrollPane;
	}

	/**
	 * This method initializes jTable	
	 * 	
	 * @return javax.swing.JTable	
	 */
	private JTable getJTable() {
		if (jTable == null) {
			
			
			jTable = new javax.swing.JTable(new AbstractTable());
			
			//String a=jTable.getValueAt(0, 0).toString();
			jTable.setSize(new Dimension(400, 400));
			//int b=Integer.parseInt(a);
			
			
		}
		return jTable;
	}
	class AbstractTable extends AbstractTableModel {
		private String[] columnNames = { " la regle", "le terme t ", "le terme t'"};
		private Object[][] data = new Object[100][3];

		public int getColumnCount() {
			return columnNames.length;
		}

		public int getRowCount() {
			return data.length;
		}

		public String getColumnName(int col) {
			return columnNames[col];
		}

		public Object getValueAt(int row, int col) {
			return data[row][col];
		}

		public void setValueAt(Object value, int row, int col) {
			data[row][col] = value;
			fireTableCellUpdated(row, col);
			
		}
		public boolean isCellEditable(int row, int col) {
		      return true;
		    }    
	}
	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(126, 9, 120, 17));
		}
		return jTextField;
	}
	
	public static void main(String[]args) {
		Table t=new Table();
		
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"  

