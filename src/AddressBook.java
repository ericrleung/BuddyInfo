import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo aBuddyInfo) {
		if (aBuddyInfo != null) {
			this.buddyInfo.add(aBuddyInfo);
		}
	}
	
	public boolean removeBuddy(BuddyInfo buddy) {
		return buddyInfo.remove(buddy);
	}
	
	public int getSize() {
		return buddyInfo.size();
	}
	
	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
		AddressBook addressBook = new AddressBook();
		addressBook.addBuddy(buddy);
		System.out.println("Size after add is " + addressBook.getSize());
		addressBook.removeBuddy(buddy);
		System.out.println("Size after remove is " + addressBook.getSize());
	}
}
