package net.madvirus.spring4.chap2;

public class PasswordChangeService{

	private UserRepository userRepository;

	public PasswordChangeService(UserRepository userRepository){
		this.userRepository = userRepository;
	}

	public void changePassword(String userId, String oldPW, String newPw)
	{
		User user = userRepository.findById(userId);
		if(user==null){
			throw new UserNotFoundException();
		}
		user.changePassword(oldPW,newPw);
	}
}
