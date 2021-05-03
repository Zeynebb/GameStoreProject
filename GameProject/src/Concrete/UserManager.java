package Concrete;
import Abstarct.UserCheckService;
import Abstarct.UserService;
import Entities.User;

public class UserManager implements UserService{
	
	private UserCheckService userCheckService;

	public UserManager(UserCheckService userCheckService) {
		this.userCheckService = userCheckService;
	}

	@Override
	public void userAdd(User user) {
		if(userCheckService.loginControl(user)) {
			System.out.println("-> "+user.getFirstName()+" "+user.getLastName()+" isimli kullanici eklendi.");
		}
		else {
			System.out.println("-> "+user.getFirstName()+" "
		+user.getLastName()+" isimli kullanicinin bilgileri gecerli degil. Kullanici eklenemedi!");
		}
	}

	@Override
	public void userDelete(User user) {
		System.out.println("-> "+user.getFirstName()+" "+user.getLastName()+" isimli kullanici silindi.");
	}

	@Override
	public void userUpdate(User user) {
		
		System.out.println("-> "+user.getFirstName()+" "+user.getLastName()+" isimli kullanicinin bilgileri guncellendi.");
		
	}

}
