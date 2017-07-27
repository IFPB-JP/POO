
public class User {
	
	private String firstName; // required
    private String lastName; // required
    private int age; // optional
    private String phone; // optional
    private String address; // optional
	
    public User(String firstName, String lastName, int age, String phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
    
    public User(String firstName, String lastName, int age, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.phone = phone;
	}
    
    public User(String firstName, String lastName, String phone, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
    
    public User(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
    
    public User(String firstName) {
		this.firstName = firstName;
	}
    
    public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
