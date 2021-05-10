package duc.basic.dev;

import java.util.Scanner;

/**
 * Viet ctr tao ra 1 lop NotValidEmail extends Exception
trong ham main khai bao bien email nhap vao tu ban phim
xay dung phuong thuc validate(String email) 
su dung throws de nem loi doi voi lop Notvalidexception, mess email nhap vao k dung neu ng nhap kp email
 * @author LAPTOP KIM ANH
 *
 */
public class MainApp {
static void checkEmail(String value) throws NotValidEmail {
		if(value.indexOf("@") == -1 ) throw new NotValidEmail("Email nhap vao khong dung");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao email = ");
		String email = sc.nextLine();
		try {
			checkEmail(email);
		} catch (NotValidEmail e) {
			// TODO Auto-generated catch block
			System.out.println(e.toString());
		}
	
	}

}
