
public class User {
	private long userId;
	private String userName;
	private String userLocation;
	private static String country;
	
	
	
	public User(long userId, String userName, String userLocation) {
		
		this.userId = userId;
		this.userName = userName;
		this.userLocation = userLocation;
	}
	
	
	public long getUserId() {
		return userId;
	}


	public String getUserName() {
		return userName;
	}


	public String getUserLocation() {
		return userLocation;
	}


	public static String getCountry() {
		return country;
	}


	public void setUserId(long userId) {
		this.userId = userId;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}


	public static void setCountry(String country) {
		User.country = country;
	}


	public User() {
		System.out.println("constructor called");
	}
	
	
static {
	country="India";
	System.out.println("static block1 called");
}

static {
	System.out.println("static block2 called");
}
public static void main(String[] args) {
	new User();
	new User();
	new User();
	
}
}
