package net.madvirus.spring4.chap2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainByXml{

	public static void main(String[] args) {
	/* xml사용하여 bean불러오기
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("classpath:config.xml");
		AuthenticationService authSvc = ctx.getBean("authenticationService",AuthenticationService.class);
		runAuthAndCatchAuthEx(authSvc,"bkchoi","1111");
		runAuthAndCatchAuthEx(authSvc,"bkchoi","11111");
		runAuthAndCatchAuthEx(authSvc,"bkchoi","111111");


		try{
			authSvc.authenticate("bkchoi2","1111");
		}catch(UserNotFoundException ex){
		}
		authSvc.authenticate("bkchoi","1234");
		PasswordChangeService pwchgsvc= ctx.getBean(PasswordChangeService.class);
		pwchgsvc.changePassword("bkchoi","1234","5678");

		runAuthAndCatchAuthEx(authSvc,"bkchoi","1234");
		authSvc.authenticate("bkchoi","5678");
		ctx.close();
	}

	private static void runAuthAndCatchAuthEx(AuthenticationService authSvc, String userId,String password){
		try{
			authSvc.authenticate(userId,password);
		}catch(AuthException ex){
		}
	}
	*/

	/* java configuration 사용 빈 적용 */

	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
	AuthenticationService authSvc = ctx.getBean("authenticationService",AuthenticationService.class);
	authSvc.authenticate("이승기","1234");
	PasswordChangeService passwordChangeService = ctx.getBean("pwChangeSvc",PasswordChangeService.class);
	passwordChangeService.changePassword("이승기","1234","567");
	ctx.close();

	}
}

