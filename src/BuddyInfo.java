
public class BuddyInfo {
	private String name;
	private String address;
	private String phone_number;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      // System.out.println("Hello world!");
		BuddyInfo buddy = new BuddyInfo("Homer", "Carleton", "613");
		System.out.println("Hello " + buddy.getName());
	}

	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public boolean equals(Object o) {
		if (o == null) return false;
		if (this == o) return true;
		if (getClass() != o.getClass()) return false;
		BuddyInfo buddy = (BuddyInfo) o;
		return buddy.getAddress().equals(this.address) && buddy.getName().equals(this.name) && buddy.getPhone_number().equals(this.phone_number);
	}
	
	public BuddyInfo(String name, String address, String phone_number) {
		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
	}

}
