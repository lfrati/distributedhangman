package registry;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UserNotificationIF extends Remote{
	public void notifyUser(String msg) throws RemoteException;
	public void closeCallback() throws RemoteException;
}
