package Ch27;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;

public class Join implements ActionListener{

	protected JFrame joinframe;
	private JTextField txtid;
	private JPasswordField txtpw;
	private JButton btninsert;
	private JButton btnexit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Join window = new Join();
					window.joinframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Join() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		joinframe = new JFrame();
		joinframe.setTitle("회원가입");
		joinframe.setBounds(100, 100, 335, 332);
		joinframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		joinframe.getContentPane().setLayout(null);
		
		txtid = new JTextField();
		txtid.setBounds(12, 22, 295, 51);
		joinframe.getContentPane().add(txtid);
		txtid.setColumns(10);
		
		txtpw = new JPasswordField();
		txtpw.setBounds(12, 83, 295, 51);
		joinframe.getContentPane().add(txtpw);
		
		btninsert = new JButton("입력");
		btninsert.setBounds(12, 166, 295, 51);
		joinframe.getContentPane().add(btninsert);
		btninsert.addActionListener(this);
		
		btnexit = new JButton("종료");
		btnexit.setBounds(12, 227, 295, 51);
		joinframe.getContentPane().add(btnexit);
		btnexit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btninsert) {
			System.out.println("입력한 ID : " + txtid.getText());
			System.out.println("입력한 PW : " + txtpw.getText());
			
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user = "system";
			String password="12345";
			
			int cnt = 0;
			String sql;
			PreparedStatement pstmt = null;
			Connection con = null;
			ResultSet rs = null;
			
			try {
				//------DB 연결------
				Class.forName(driver);
				System.out.println("Driver Loading Success!!");
				con = DriverManager.getConnection(url, user, password);
				System.out.println("DB Connected!!");
				
				//------Query 실행------
				sql = "SELECT ID, PW FROM LOGIN";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				//------기존 계정 존재 여부------
				boolean i = true;
				while(i = rs.next()) {
					if(rs.getString("ID").equals(txtid.getText()) && (rs.getString("PW").equals(txtpw.getText()))) {
						JOptionPane.showMessageDialog(null, "동일한 아이디, 비밀번호가 있습니다.");
						break;
					}
				}
				if(i == false) {
					pstmt = con.prepareStatement("INSERT INTO LOGIN VALUES((SELECT NVL(MAX(NO),0)+1 FROM LOGIN), ?, ?)");
					pstmt.setString(1, txtid.getText());
					pstmt.setString(2, txtpw.getText());
					pstmt.executeQuery();
					JOptionPane.showMessageDialog(null, "계정 생성을 완료했습니다.");
				}
			} catch(Exception e1) {
				e1.printStackTrace();
			} finally {
				try {
					if(rs != null) {
						rs.close();
					}
				}catch(Exception e2) {}
				try {
					if(pstmt != null) {
						pstmt.close();
					}
				}catch(Exception e3) {}
				try {
					if(con != null) {
						con.close();
					}
				}catch(Exception e4) {}
			}
		} else if(e.getSource() == btnexit) {
			joinframe.setVisible(false);
			/*int result = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
			//예 : 0, 아니오 : 1, 취소  : 3
			if(result == 0) {
				System.exit(0);
			}*/
		}
	}
}
