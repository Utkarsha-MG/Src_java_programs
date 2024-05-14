package new1;

class Method_Parent {
	void login() {
		System.out.println("Login with Otp");

	}
}

public class MethodOverriden extends Method_Parent {

	void login() {
		//super.login();//we can call here as well and below sop also
		System.out.println("Login with Google account");
        super.login();
	}

	public static void main(String[] args) {
		MethodOverriden m1 = new MethodOverriden();
		m1.login();
		

	}

}
