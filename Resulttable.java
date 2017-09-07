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

public class Resulttable extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JScrollPane jScrollPane = null;
	private static JTable jTable = null;
	private JLabel jLabel = null;
	private JLabel jLabel1 = null;
	private JLabel jLabel2 = null;
	public JTextField jTextField = null;
	public JTextField jTextField1 = null;
	/**
	 * This is the default constructor
	 * @throws UnsupportedLookAndFeelException 
	 */
	public Resulttable()  {
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
		this.setTitle("les resultats");
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
			jLabel2 = new JLabel();
			jLabel2.setBounds(new Rectangle(23, 298, 146, 19));
			jLabel2.setText("    le nbre des transitions");
			jLabel1 = new JLabel();
			jLabel1.setBounds(new Rectangle(22, 272, 137, 18));
			jLabel1.setText("     le nbre des états");
			jLabel = new JLabel();
			jLabel.setBounds(new Rectangle(89, 4, 201, 20));
			jLabel.setText("       les tuples résultants sont:");
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.add(getJScrollPane(), null);
			jContentPane.add(jLabel, null);
			jContentPane.add(jLabel1, null);
			jContentPane.add(jLabel2, null);
			jContentPane.add(getJTextField(), null);
			jContentPane.add(getJTextField1(), null);
		}
		return jContentPane;
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
			jScrollPane.setBounds(new Rectangle(20, 40, 350, 220));
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
	 static class AbstractTable extends AbstractTableModel {
		public String[] columnNames = { " ", " ", ""};
		public Object[][] data = new Object[100][3];

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
		/*public boolean isCellEditable(int row, int col) {
		      return true;
		    }*/    
	}
	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(187, 272, 54, 18));
		}
		return jTextField;
	}

	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setBounds(new Rectangle(188, 299, 52, 18));
		}
		return jTextField1;
	}
public void remplirt(String v,int i,int j){
	jTable.setValueAt(v, i, j);
}
	

}  //  @jve:decl-index=0:visual-constraint="10,10"  


