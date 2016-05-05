package se.lu.ics.grupp11;

import java.rmi.RemoteException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		WebServicePartycipateDBSoapProxy proxy = new WebServicePartycipateDBSoapProxy();
		FileServiceSoapProxy fileproxy = new FileServiceSoapProxy();

		try {
			System.out.println(proxy.getEvents());
			System.out.println(proxy.getUsers());
			System.out.println(fileproxy.readFile("test.txt"));
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	} // main

}
