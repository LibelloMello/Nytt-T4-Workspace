/**
 * WebServiceERPSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package se.lu.ics.grupp11.ERP;

public interface WebServiceERPSoap extends java.rmi.Remote {
    public java.lang.String hello() throws java.rmi.RemoteException;
    public java.lang.String[][] getAllEmployeesRelatives() throws java.rmi.RemoteException;
    public java.lang.String[][] getAllEmployees() throws java.rmi.RemoteException;
    public java.lang.String[][] getAllSickEmployees2004() throws java.rmi.RemoteException;
    public java.lang.String[][] getEmployeeWithMostAbsence() throws java.rmi.RemoteException;
    public java.lang.String[][] getCronusKeys() throws java.rmi.RemoteException;
    public java.lang.String[][] getCronusIndexes() throws java.rmi.RemoteException;
    public java.lang.String[][] getCronusTableConstraints() throws java.rmi.RemoteException;
    public java.lang.String[][] getCronusTables() throws java.rmi.RemoteException;
    public java.lang.String[][] getCronusTables1() throws java.rmi.RemoteException;
    public java.lang.String[][] getCronusEmployeeColumns() throws java.rmi.RemoteException;
    public java.lang.String[][] getCronusEmployeeColumns1() throws java.rmi.RemoteException;
    public void updateEmployee(java.lang.String id, java.lang.String name) throws java.rmi.RemoteException;
    public void addEmployee(java.lang.String id, java.lang.String name) throws java.rmi.RemoteException;
    public void deleteEmployee(java.lang.String id) throws java.rmi.RemoteException;
}
