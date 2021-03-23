package Ch27;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.Scanner;

public class LoginUI implements ActionListener {

	private JFrame frame;
	private JTextField txtid;
	private JButton btnlogin;
	private JButton btnjoin;
	private JButton btnexit;
	private JPasswordField txtpw;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginUI window = new LoginUI();
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
	public LoginUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("로그인창");
		frame.setBounds(100, 100, 335, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtid = new JTextField();
		txtid.setColumns(10);
		txtid.setBounds(12, 22, 295, 51);
		frame.getContentPane().add(txtid);
		
		txtpw = new JPasswordField();
		txtpw.setBounds(12, 83, 295, 51);
		frame.getContentPane().add(txtpw);
		
		btnlogin = new JButton("로그인");
		btnlogin.setBounds(12, 165, 295, 51);
		frame.getContentPane().add(btnlogin);
		btnlogin.addActionListener(this);
		
		btnjoin = new JButton("가입");
		btnjoin.setBounds(12, 226, 295, 51);
		frame.getContentPane().add(btnjoin);
		btnjoin.addActionListener(this);
		
		btnexit = new JButton("종료");
		btnexit.setBounds(12, 287, 295, 51);
		frame.getContentPane().add(btnexit);
		btnexit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnlogin) {
			System.out.println("입력한 ID : " + txtid.getText());
			System.out.println("입력한 PW : " + txtpw.getText());
			
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "system";
			String password="rootpassword";
			
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
				
				//------ID/PW 일치 확인------
				boolean i = true;
				while(i = rs.next()) {
					if(rs.getString("ID").equals(txtid.getText()) && (rs.getString("PW").equals(txtpw.getText()))) {
						JOptionPane.showMessageDialog(null, "로그인 성공");
						break;
					}
				}
				if(i == false) {
					JOptionPane.showMessageDialog(null, "로그인 실패");
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
		} else if(e.getSource() == btnjoin) {
			try {
				Join sub = new Join();
				sub.joinframe.setVisible(true);	
			}catch(Exception e5) {
				e5.printStackTrace();
			}
			
		} else if(e.getSource() == btnexit) {
			int result = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
			//예 : 0, 아니오 : 1, 취소  : 3
			if(result == 0) {
				System.exit(0);
			}
		}
	}
}