package net.madvirus.spring4.chap2;
public class AuthFailLogger{

	private int threshold;
	private int failCounts;

	public void insertBadPw(String userId, String inputPw){

		System.out.printf("AuthFail [type=badpw, userId=%s , pw=%s]",userId, inputPw);
		failCounts++;
		if(threshold>0&&failCounts>threshold){
			notifyTooMany();
			failCounts=0;
		}

	}

	private void notifyTooMany(){
		System.out.println("너무 많은 로그인 실패");
	}

	public void setThreshold(int threshold){
		this.threshold = threshold;
	}
}
