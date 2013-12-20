package server;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface IPPServer extends Remote{
	
	boolean pay(long creditCardNum, double amount) throws RemoteException;
	
}
