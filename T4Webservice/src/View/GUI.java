package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import Controller.Controller;
import Exception.T4Exceptions;
import se.lu.ics.grupp11.Event;
import se.lu.ics.grupp11.User;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;

public class GUI {

	private JFrame frame;
	private JTextField textFieldFileName;
	private JTable tableEventResults;


	String[] columnNamesUser = { "Username", "Phone number", "Email", "Name" };
	String[] columnNamesEvents = { "EventId", "Event name", "Event time", "Location", "Note", "Open slots", "Owner" };
	DefaultTableModel cooling = new DefaultTableModel();
	DefaultTableModel tableModelUsers = new DefaultTableModel(columnNamesUser, 0);
	DefaultTableModel tableModelEvents = new DefaultTableModel(columnNamesEvents, 0);

	private JTable tableInfo;
	private JTable tableEvents;
	private final JTable table = new JTable();
	private JTable tableResultsUser;
	private JTable tableERPResults;
	private JTable tableResults;
	private JTextField tfEmployeeName;
	private JTextField tfEmployeeId;
	private JTextField tfDeleteEmployeeId;
	private JTextField tfUpdateId;
	private JTextField tfUpdateName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 779, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JScrollPane scrollPaneUsers = new JScrollPane();

		JScrollPane scrollPaneEvents = new JScrollPane();
		frame.getContentPane().setLayout(null);

		JTabbedPane tpWebService = new JTabbedPane(JTabbedPane.TOP);
		tpWebService.setBounds(2, 0, 761, 512);
		frame.getContentPane().add(tpWebService);

		JPanel panelWebServices = new JPanel();
		tpWebService.addTab("Web services", null, panelWebServices, null);

		JPanel panelResultWeb = new JPanel();
		panelResultWeb.setBounds(21, 118, 620, 177);
		panelWebServices.add(panelResultWeb);

		JLabel lblFetchFileResult = new JLabel("");
		lblFetchFileResult.setBounds(265, 74, 323, 14);
		panelWebServices.add(lblFetchFileResult);

		JLabel labelErrorMessagepanelMain = new JLabel("");
		labelErrorMessagepanelMain.setBounds(21, 341, 620, 14);
		panelWebServices.add(labelErrorMessagepanelMain);

		JPanel panelERPIntegration = new JPanel();
		tpWebService.addTab("ERP Integration", null, panelERPIntegration, null);
		panelERPIntegration.setLayout(null);

		JScrollPane spResults = new JScrollPane();
		spResults.setBounds(43, 255, 634, 171);
		panelERPIntegration.add(spResults);

		tableResults = new JTable(cooling);
		tableResults.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		spResults.setViewportView(tableResults);
		
		JLabel labelErrorMessageERP = new JLabel("");
		labelErrorMessageERP.setBounds(53, 381, 624, 14);
		panelERPIntegration.add(labelErrorMessageERP);

		JButton btnGetUsers = new JButton("Get users");
		btnGetUsers.setBounds(21, 28, 112, 23);
		btnGetUsers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				scrollPaneEvents.setVisible(false);
				scrollPaneUsers.setBounds(0, 0, 620, 114);
				panelResultWeb.add(scrollPaneUsers);

				tableResultsUser = new JTable(tableModelUsers);
				scrollPaneUsers.setViewportView(tableResultsUser);
				tableModelUsers.setRowCount(0);
				try {
					for (User u : Controller.getUsers()) {
						Object[] userData = { u.getUserName(), u.getAge(), u.getEmail(), u.getName(), u.getPassword(),
								u.getPhoneNumber() };
						tableModelUsers.addRow(userData);
						scrollPaneUsers.setVisible(true);

					}
				} catch (T4Exceptions e) {
					labelErrorMessageERP.setText("Unable to connect, please connect the webservices in Visual Studiorino");
				}

			}
		});
		panelWebServices.setLayout(null);

		panelWebServices.add(btnGetUsers);

		JButton btnGetEvents = new JButton("Get events");
		btnGetEvents.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				scrollPaneUsers.setVisible(false);

				scrollPaneEvents.setBounds(0, 0, 620, 114);
				panelResultWeb.add(scrollPaneEvents);

				tableEvents = new JTable(tableModelEvents);
				scrollPaneEvents.setViewportView(tableEvents);

				tableModelEvents.setRowCount(0);
				try {
					for (Event e : Controller.getEvents()) {
						Object[] eventData = { e.getEventId(), e.getEventName(), e.getEventTime(), e.getLocation(),
								e.getOpenSlots(), e.getOwner() };
						tableModelEvents.addRow(eventData);
						scrollPaneEvents.setVisible(true);
					}
				} catch (T4Exceptions e) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studio");

				}
			}
		});
		btnGetEvents.setBounds(143, 28, 112, 23);
		panelWebServices.add(btnGetEvents);

		JButton btnFetchFile = new JButton("Fetch file");
		btnFetchFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = textFieldFileName.getText();
				try {
					lblFetchFileResult.setText(Controller.readFile(input));
				} catch (T4Exceptions e3) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studio");
				}

			}
		});
		btnFetchFile.setBounds(265, 28, 99, 23);
		panelWebServices.add(btnFetchFile);

		textFieldFileName = new JTextField();
		textFieldFileName.setBounds(374, 29, 146, 20);
		panelWebServices.add(textFieldFileName);
		textFieldFileName.setColumns(10);
		panelResultWeb.setLayout(null);

		JButton btnGetMostSickEmployees = new JButton("Sickest employees");
		btnGetMostSickEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String[][] sickestEmployees = null;
				try {
					sickestEmployees = Controller.getEmployeeWithMostAbsence();
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
				String[] columnNamessickestEmployees = sickestEmployees[0];

				cooling.setRowCount(0);

				cooling.setDataVector(sickestEmployees, columnNamessickestEmployees);
			}
		});
		btnGetMostSickEmployees.setBounds(43, 26, 161, 23);
		panelERPIntegration.add(btnGetMostSickEmployees);

		JButton btnGetAllEmployees = new JButton("Find all employees");
		btnGetAllEmployees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String[][] employees = null;
				try {
					employees = Controller.getAllEmployees();
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
				String[] employeesColumnNames = employees[0];

				cooling.setRowCount(0);

				cooling.setDataVector(employees, employeesColumnNames);

			}
		});
		btnGetAllEmployees.setBounds(43, 60, 161, 23);
		panelERPIntegration.add(btnGetAllEmployees);

		JButton btnKeys = new JButton("All keys");
		btnKeys.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String[][] keys = null;
				try {
					keys = Controller.getKeys();
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
				String[] columnNameskeys = keys[0];

				cooling.setRowCount(0);

				cooling.setDataVector(keys, columnNameskeys);

			}
		});
		btnKeys.setBounds(548, 26, 129, 23);
		panelERPIntegration.add(btnKeys);

		JButton btnAllIndexes = new JButton("All indexes");
		btnAllIndexes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String[][] indexes = null;
				try {
					indexes = Controller.getAllIndexes();
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
				String[] columnNamesIndexes = indexes[0];

				cooling.setRowCount(0);

				cooling.setDataVector(indexes, columnNamesIndexes);
			}
		});
		btnAllIndexes.setBounds(409, 26, 129, 23);
		panelERPIntegration.add(btnAllIndexes);

		JButton btnAllConstraints = new JButton("All constraints");
		btnAllConstraints.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[][] constraints = null;
				try {
					constraints = Controller.getAllConstraints();
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
				String[] columnNamesConstraints = constraints[0];

				cooling.setRowCount(0);

				cooling.setDataVector(constraints, columnNamesConstraints);

			}
		});
		btnAllConstraints.setBounds(409, 60, 129, 23);
		panelERPIntegration.add(btnAllConstraints);

		JButton btnAllTables = new JButton("All tables");
		btnAllTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[][] tables = null;
				try {
					tables = Controller.getTables();
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
				String[] columnNamesTables = tables[0];

				cooling.setRowCount(0);

				cooling.setDataVector(tables, columnNamesTables);
			}
		});
		btnAllTables.setBounds(409, 94, 129, 23);
		panelERPIntegration.add(btnAllTables);

		JButton btnAllTables_1 = new JButton("All tables 1");
		btnAllTables_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String[][] tables1 = null;
				try {
					tables1 = Controller.getTables1();
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
				String[] columnNamesTables1 = tables1[0];

				cooling.setRowCount(0);

				cooling.setDataVector(tables1, columnNamesTables1);
			}
		});
		btnAllTables_1.setBounds(548, 94, 129, 23);
		panelERPIntegration.add(btnAllTables_1);

		JButton btnAllColumns = new JButton("All columns");
		btnAllColumns.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[][] columns = null;
				try {
					columns = Controller.getColumns();
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
				String[] columnNamesColumns = columns[0];

				cooling.setRowCount(0);

				cooling.setDataVector(columns, columnNamesColumns);
			}
		});
		btnAllColumns.setBounds(409, 126, 129, 23);
		panelERPIntegration.add(btnAllColumns);

		JButton btnSickEmployees2014 = new JButton("Sick employees 2004");
		btnSickEmployees2014.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				String[][] sick2004 = null;
				try {
					sick2004 = Controller.getAllSickEmployees2004();
				} catch (T4Exceptions e) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e.printStackTrace();
				}
				String[] columnNamessick2004 = sick2004[0];

				cooling.setRowCount(0);

				cooling.setDataVector(sick2004, columnNamessick2004);
			}

		});
		btnSickEmployees2014.setBounds(43, 94, 161, 23);
		panelERPIntegration.add(btnSickEmployees2014);

		tfEmployeeName = new JTextField();
		tfEmployeeName.setBounds(129, 154, 75, 20);
		panelERPIntegration.add(tfEmployeeName);
		tfEmployeeName.setColumns(10);

		tfEmployeeId = new JTextField();
		tfEmployeeId.setBounds(43, 154, 75, 20);
		panelERPIntegration.add(tfEmployeeId);
		tfEmployeeId.setColumns(10);

		tfDeleteEmployeeId = new JTextField();
		tfDeleteEmployeeId.setBounds(43, 224, 75, 20);
		panelERPIntegration.add(tfDeleteEmployeeId);
		tfDeleteEmployeeId.setColumns(10);

		JButton btnAddEmployee = new JButton("Add employee");
		btnAddEmployee.setBounds(224, 153, 117, 23);
		panelERPIntegration.add(btnAddEmployee);

		JButton btnDeleteEmployee = new JButton("Delete employee");
		btnDeleteEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Controller.deleteEmployee(tfDeleteEmployeeId.getText());
				} catch (T4Exceptions e1) {
					labelErrorMessageERP.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
			}
		});
		btnDeleteEmployee.setBounds(129, 221, 117, 23);
		panelERPIntegration.add(btnDeleteEmployee);

		JButton btnGetAllEmployeesRelatives = new JButton("Get all relatives");
		btnGetAllEmployeesRelatives.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				cooling.setRowCount(0);

				String[][] relatives = null;
				try {
					relatives = Controller.getAllEmployeesRelatives();
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
				String[] columnNamesrelatives = relatives[0];

				cooling.setDataVector(relatives, columnNamesrelatives);

			}
		});
		btnGetAllEmployeesRelatives.setBounds(548, 60, 129, 23);
		panelERPIntegration.add(btnGetAllEmployeesRelatives);

		JButton btnAllColumns_1 = new JButton("All columns1");
		btnAllColumns_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[][] columns1 = null;
				try {
					columns1 = Controller.getColumns1();
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
				String[] columnNamesColumns1 = columns1[0];

				cooling.setRowCount(0);

				cooling.setDataVector(columns1, columnNamesColumns1);

			}
		});
		btnAllColumns_1.setBounds(548, 128, 129, 23);
		panelERPIntegration.add(btnAllColumns_1);
		
		JButton btnUpdateEmployee = new JButton("Update employee");
		btnUpdateEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tfUpdateId.getText();
				String name = tfUpdateName.getText();
				try {
					Controller.updateEmployee(id, name);
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
			}
		});
		btnUpdateEmployee.setBounds(224, 187, 117, 23);
		panelERPIntegration.add(btnUpdateEmployee);
		
		tfUpdateId = new JTextField();
		tfUpdateId.setBounds(43, 191, 75, 20);
		panelERPIntegration.add(tfUpdateId);
		tfUpdateId.setColumns(10);
		
		tfUpdateName = new JTextField();
		tfUpdateName.setColumns(10);
		tfUpdateName.setBounds(129, 191, 75, 20);
		panelERPIntegration.add(tfUpdateName);
		
		JLabel lblEmployeeId = new JLabel("Employee ID");
		lblEmployeeId.setBounds(43, 130, 75, 14);
		panelERPIntegration.add(lblEmployeeId);
		
		JLabel lblEmployeeName = new JLabel("Employee name");
		lblEmployeeName.setBounds(129, 130, 90, 14);
		panelERPIntegration.add(lblEmployeeName);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(43, 126, 322, 2);
		panelERPIntegration.add(separator);
		


		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tfEmployeeId.getText();
				String name = tfEmployeeName.getText();
				try {
					Controller.addEmployee(id, name);
				} catch (T4Exceptions e1) {
					labelErrorMessageERP
							.setText("Unable to connect, please connect the webservices in Visual Studiorino");
					e1.printStackTrace();
				}
			}
		});

	}
}
