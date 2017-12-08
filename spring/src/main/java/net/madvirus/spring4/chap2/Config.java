package net.madvirus.spring4.chap2;

import java.util.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
		public User user3(){
			return new User("이승기","1234");
		}

	@Bean(name="user4")
		public User user(){
			return new User("오진우","123");
		}

	@Bean
		public PasswordChangeService pwChangeSvc(){
			return new PasswordChangeService(userRepository());
		}

	@Bean
		public AuthFailLogger authFailLogger(){
			AuthFailLogger logger = new AuthFailLogger();
			logger.setThreshold(2);
			return logger;
		}

	@Bean
		public AuthenticationService authenticationService(){
			AuthenticationService authSvc = new AuthenticationService();
			authSvc.setFailLogger(authFailLogger());
			authSvc.setUserRepository(userRepository());
			return authSvc;
		}
	@Bean
		public UserRepository userRepository(){
			UserRepository userRepository = new UserRepository();
			userRepository.setUsers(Arrays.asList(user3(),user()));
					return userRepository;
	}
}

    
