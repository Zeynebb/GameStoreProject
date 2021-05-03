package Adapters;

import Abstarct.UserCheckService;
import Entities.User;

public class LoginCheckAdapter implements UserCheckService{

	@Override
	public boolean loginControl(User user) {
		boolean result=false;
		if(user.getNationalityId().length()!=11) {
			result=false;
		}
		else {
			result=true;
		}
		return result;
	}

}
