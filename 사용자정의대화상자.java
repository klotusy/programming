import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Code12_22 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("사용자 정의");
		frame.setLayout(null);			
		frame.setSize(300, 300);
		frame.setVisible(true);		
		
		String[] strAry = {"R&B", "재즈", "힙합", "K-pop" };
		int result = JOptionPane.showOptionDialog(frame, "좋아하는 음악장르는?", "제목", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, strAry, null );
		
		JOptionPane.showMessageDialog(frame, strAry[result] + " 선택함");
	}
}
