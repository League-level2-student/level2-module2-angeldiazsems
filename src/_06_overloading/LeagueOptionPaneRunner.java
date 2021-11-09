package _06_overloading;

import javax.swing.JOptionPane;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		LeagueOptionPane league = new LeagueOptionPane();
		league.showMessageDialog("The leage is the bes");
		league.showMessageDialogTWO(JOptionPane.showInputDialog("what is the message"), JOptionPane.showInputDialog("what is the title"));
		league.showMessageDialogTHREE(JOptionPane.showInputDialog("what is the message"), JOptionPane.showInputDialog("what is the title"), JOptionPane.showInputDialog("what is the file name(java.png, league.png,or leagueDark.png"));

	}
}

