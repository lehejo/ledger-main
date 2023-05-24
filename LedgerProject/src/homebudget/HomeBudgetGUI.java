package homebudget;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class HomeBudgetGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                InitialAmountFrame frame = new InitialAmountFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
}
