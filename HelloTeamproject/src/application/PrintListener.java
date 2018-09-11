package application;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class PrintListener implements ActionListener {

	private GuiList list;

	public PrintListener(GuiList list) {
		this.list = list;
	}

	public void actionPerformed(ActionEvent e) {
		int selected[] = list.getList().getSelectedIndices();
		System.out.println("Selected Elements:  ");

		for (int i = 0; i < selected.length; i++) {
			String element = (String) list.getList().getModel().getElementAt(selected[i]);
			System.out.println("  " + element);
		}
	}
}
