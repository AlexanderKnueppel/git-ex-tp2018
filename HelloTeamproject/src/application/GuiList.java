package application;

import java.awt.BorderLayout;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GuiList extends JPanel {
	private static final long serialVersionUID = 1L;

	private String label[] = { "Thomas", "Alex", "Paul",  "Joshua", "Chico"};

	private JList<String> list;

	public GuiList() {
		setLayout(new BorderLayout());

		list = new JList<String>(label);
		JButton button = new JButton("Print");
		JScrollPane pane = new JScrollPane(list);

		DefaultListSelectionModel m = new DefaultListSelectionModel();
		m.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		m.setLeadAnchorNotificationEnabled(false);
		list.setSelectionModel(m);

		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				System.out.println("[Values changed]");
			}
		});

		button.addActionListener(new PrintListener(this));

		add(pane, BorderLayout.NORTH);
		add(button, BorderLayout.SOUTH);
	}

	JList<String> getList() {
		return list;
	}
}
