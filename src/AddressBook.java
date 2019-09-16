import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddies;
	
	public void addBuddy(BuddyInfo buddy) {
		buddies.add(buddy);
	}
	
	public boolean removeBuddy(BuddyInfo buddy) {
		return buddies.remove(buddy);
	}
	
	public int getSize() {
		return buddies.size();
	}
	
	public AddressBook() {
		this.buddies = new ArrayList<BuddyInfo>();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(buddy);
	}
}
