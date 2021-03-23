package Ch26;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class UITest implements ActionListener, ItemListener{

	private JFrame frame;
	private JTextField tfName;
	private JTextField tfAge;
	private JTextField tfBirthday;
	private JLabel lbName;
	private JLabel lbAge;
	private JLabel lbBirthday;
	private JRadioButton rbMan;
	private JRadioButton rbWoman;
	private JCheckBox chkReading;
	private JCheckBox chkClimbing;
	private JCheckBox chkFishing;
	private JLabel label;
	private JComboBox<String> cmbHH;
	private JButton btnInsert;
	private JButton btnCancel;
	private JLabel lbMSG;
	private ButtonGroup rbGrp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UITest window = new UITest();
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
	public UITest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 422, 270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lbName = new JLabel("성명");
		lbName.setBounds(12, 31, 29, 15);
		frame.getContentPane().add(lbName);
		
		tfName = new JTextField();
		tfName.setBounds(53, 28, 123, 21);
		frame.getContentPane().add(tfName);
		tfName.setColumns(10);
		
		lbAge = new JLabel("나이");
		lbAge.setBounds(12, 89, 29, 15);
		frame.getContentPane().add(lbAge);
		
		tfAge = new JTextField();
		tfAge.setBounds(53, 86, 123, 21);
		frame.getContentPane().add(tfAge);
		tfAge.setColumns(10);
		
		lbBirthday = new JLabel("생일");
		lbBirthday.setBounds(12, 141, 29, 15);
		frame.getContentPane().add(lbBirthday);
		
		tfBirthday = new JTextField();
		tfBirthday.setColumns(10);
		tfBirthday.setBounds(53, 138, 123, 21);
		frame.getContentPane().add(tfBirthday);
		
		rbMan = new JRadioButton("남자");
		rbMan.setBounds(219, 85, 52, 23);
		frame.getContentPane().add(rbMan);
		rbMan.addItemListener(this);
		
		rbWoman = new JRadioButton("여자");
		rbWoman.setBounds(298, 85, 52, 23);
		frame.getContentPane().add(rbWoman);
		rbWoman.addItemListener(this);
		
		chkReading = new JCheckBox("독서");
		chkReading.setBounds(337, 137, 61, 23);
		frame.getContentPane().add(chkReading);
		chkReading.addItemListener(this);
		
		chkClimbing = new JCheckBox("등산");
		chkClimbing.setBounds(259, 137, 61, 23);
		frame.getContentPane().add(chkClimbing);
		chkClimbing.addItemListener(this);
		
		chkFishing = new JCheckBox("낚시");
		chkFishing.setBounds(184, 137, 61, 23);
		frame.getContentPane().add(chkFishing);
		chkFishing.addItemListener(this);
		
		label = new JLabel("생시");
		label.setBounds(213, 31, 32, 15);
		frame.getContentPane().add(label);
		
		cmbHH = new JComboBox();
		cmbHH.setModel(new DefaultComboBoxModel<String>(new String[] {"99 미선택", "00 자", "01 축", "02 인", "03 묘", "04 진", "05 사", "06 오", "07 미", "08 신", "09 유", "10 술", "11 해"}));
		cmbHH.setBounds(282, 28, 82, 21);
		frame.getContentPane().add(cmbHH);
		cmbHH.addItemListener(this);
		
		btnInsert = new JButton("입력");
		btnInsert.setBounds(79, 180, 97, 23);
		frame.getContentPane().add(btnInsert);
		btnInsert.addActionListener(this);
		
		btnCancel = new JButton("취소");
		btnCancel.setBounds(253, 180, 97, 23);
		frame.getContentPane().add(btnCancel);
		btnCancel.addActionListener(this);
		
		lbMSG = new JLabel("", lbMSG.CENTER);
		lbMSG.setBounds(267, 180, 97, 23);
		frame.getContentPane().add(lbMSG);
		
		rbGrp = new ButtonGroup();
		rbGrp.add(rbMan);
		rbGrp.add(rbWoman);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnInsert) {
			lbMSG.setText("입력");
		} else if(e.getSource() == btnCancel) {
			lbMSG.setText("취소");
		}
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		if(arg0.getSource() == cmbHH) {
			if(arg0.getStateChange() == ItemEvent.SELECTED) {
				lbMSG.setText("생시 : " + arg0.getItem());
			}
		}
		else if(arg0.getSource() == chkReading) {
			if(arg0.getStateChange() == ItemEvent.SELECTED) {
				lbMSG.setText("독서 O");	
			} else {
				lbMSG.setText("독서 X");
			}
		} else if(arg0.getSource() == chkClimbing) {
			if(arg0.getStateChange() == ItemEvent.SELECTED) {
				lbMSG.setText("등산 O");	
			} else {
				lbMSG.setText("등산 X");
			}
		} else if(arg0.getSource() == chkFishing) {
			if(arg0.getStateChange() == ItemEvent.SELECTED) {
				lbMSG.setText("낚시 O");	
			} else {
				lbMSG.setText("낚시 X");
			}
		}
		else if(arg0.getSource() == rbMan) {
			if(arg0.getStateChange() == ItemEvent.SELECTED) {
				lbMSG.setText("남자");	
			}
		} else if(arg0.getSource() == rbWoman) {
			if(arg0.getStateChange() == ItemEvent.SELECTED) {
				lbMSG.setText("여자");	
			}
		}
	}
}