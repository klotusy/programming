import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Code12_21 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Yes/No 선택");
		frame.setLayout(null);			
		frame.setSize(300, 300);
		frame.setVisible(true);		

		int result = JOptionPane.showConfirmDialog(null, "알앤비를 좋아합니까", "선택", JOptionPane.YES_NO_CANCEL_OPTION );
		
		if (result == JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(frame, "Yes");
		else if (result == JOptionPane.NO_OPTION)
			JOptionPane.showMessageDialog(frame, "No");
		else 
			JOptionPane.showMessageDialog(frame, "Cancel");
	}
}
