package demoGameMarketing.core.adapters.concretes;

import java.rmi.RemoteException;

import demoGameMarketing.core.adapters.absracts.UserCheckService;
import demoGameMarketing.entities.concretes.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = true;

		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(user.getIdentityNumber()),
					user.getFirstName().toUpperCase(), user.getLastName().toUpperCase(),
					user.getDateOfBirth().getYear());

		} catch (RemoteException e) {
			result = false;
			e.printStackTrace();
		}
		if (result) {
			System.out.println("User verified.");
		} else {
			System.out.println("User can not be verified.");
		}
		return result;
	}
}
