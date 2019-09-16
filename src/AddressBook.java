import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddies;
	
	public void addBuddy(BuddyInfo buddy) {
		buddies.add(buddy);
	}
	
	public boolean removeBuddy(BuddyInfo buddy) {
		return buddies.remove(buddy);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		System.out.println("Address Book");
	}
}
