package Adapters;
import java.rmi.RemoteException;

import Abstarct.UserCheckService;
import Entities.User;
import mernisCheck.KPSPublicSoapProxy;

public class MernisCheckAdapter implements UserCheckService{

	@Override
	public boolean loginControl(User user) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=false;
		try {
			result=client.TCKimlikNoDogrula(
						Long.valueOf(user.getNationalityId()), 
						user.getFirstName(), 
						user.getLastName(), 
						user.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
