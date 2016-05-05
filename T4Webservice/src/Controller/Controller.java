package Controller;

import java.rmi.RemoteException;
import java.util.ArrayList;

import Exception.T4Exceptions;
import se.lu.ics.grupp11.Event;
import se.lu.ics.grupp11.FileServiceSoapProxy;
import se.lu.ics.grupp11.User;
import se.lu.ics.grupp11.WebServicePartycipateDBSoapProxy;
import se.lu.ics.grupp11.ERP.WebServiceERPSoapProxy;

public class Controller {
	static WebServicePartycipateDBSoapProxy proxy = new WebServicePartycipateDBSoapProxy();
	static FileServiceSoapProxy fileproxy = new FileServiceSoapProxy();
	static String fileResponse;
	static String msg = "";
	static WebServiceERPSoapProxy ERPproxy = new WebServiceERPSoapProxy();

	public static String readFile(String input) throws T4Exceptions {
		try {
			fileResponse = fileproxy.readFile(input);
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		
		}
		return fileResponse;
	}

	public static Event[] getEvents() throws T4Exceptions {

		Event[] eventList = null;
		try {
			eventList = proxy.getEvents();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		return eventList;
	}

	public static User[] getUsers() throws T4Exceptions {

		User[] userList = null;
		try {
			userList = proxy.getUsers();
			msg = "All the users";
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studioeee";
			throw new T4Exceptions(msg, e);

		}
		return userList;
	}
	public static String[][] getAllEmployeeRelatives() throws T4Exceptions {
		String[][] employeeRelativeList = null;
		try {
			employeeRelativeList = ERPproxy.getAllEmployeesRelatives();
		} catch(RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		
		
		return employeeRelativeList;
	}
	public static String[][] getAllSickEmployees2004() throws T4Exceptions {
		String[][] sickEmployees2004 = null;
		try {
			sickEmployees2004 = ERPproxy.getAllSickEmployees2004();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
		throw new T4Exceptions(msg, e);
		}
		return sickEmployees2004;
	}
	public static String[][] getAllEmployees() throws T4Exceptions {
		String[][] allEmployees = null;
		try {
			allEmployees = ERPproxy.getAllEmployees();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		return allEmployees;
	}

	public static void addEmployee(String id, String name) throws T4Exceptions {
		try {
			ERPproxy.addEmployee(id, name);
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		
			
		}
		
	}
	public static void deleteEmployee(String id) throws T4Exceptions {
		try {
			ERPproxy.deleteEmployee(id);
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			e.printStackTrace();
			throw new T4Exceptions(msg, e);
			
			
			
		}
	}
	public static String[][] getAllEmployeesRelatives() throws T4Exceptions {
		
		String[][] allEmployeesRelatives = null;
		try {
			allEmployeesRelatives = ERPproxy.getAllEmployeesRelatives();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		return allEmployeesRelatives;
		
	}
	
	public static String[][] getEmployeeWithMostAbsence() throws T4Exceptions {
		String[][] sickestEmployees = null;
		try {
			sickestEmployees = ERPproxy.getEmployeeWithMostAbsence();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		return sickestEmployees;
	}
	public static String[][] getAllIndexes() throws T4Exceptions {
		String[][] indexes = null;
		try {
			indexes = ERPproxy.getCronusIndexes();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		return indexes;
	}
	public static String[][] getAllConstraints() throws T4Exceptions {
		String[][] constraints = null;
		try {
			constraints = ERPproxy.getCronusTableConstraints();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		return constraints;
	}
	public static String[][] getColumns() throws T4Exceptions {
		String[][] columns = null;
		try {
			columns = ERPproxy.getCronusEmployeeColumns();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		return columns;
	}
	public static String[][] getColumns1() throws T4Exceptions {
		String[][] columns = null;
		try {
			columns = ERPproxy.getCronusEmployeeColumns1();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		return columns;
	}
	public static String[][] getKeys() throws T4Exceptions {
		String[][] keys = null;
		try {
			keys = ERPproxy.getCronusKeys();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		return keys;
	}
	public static String[][] getTables() throws T4Exceptions {
		String[][] tables = null;
		try {
			tables = ERPproxy.getCronusTables();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		return tables;
	}
	public static String[][] getTables1() throws T4Exceptions {
		String[][] tables1 = null;
		try {
			tables1 = ERPproxy.getCronusTables1();
		} catch (RemoteException e) {
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
		return tables1;
	}
	
	public static void updateEmployee(String id, String name) throws T4Exceptions {
		try {
			ERPproxy.updateEmployee(id, name);
		} catch (RemoteException e) {
			
			e.printStackTrace();
			msg = "Unable to connect, please try to connect webservices from Visual Studio";
			throw new T4Exceptions(msg, e);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
