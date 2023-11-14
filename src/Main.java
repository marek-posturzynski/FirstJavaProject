public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }class Contact{
        String name;
        String email;
        String phoneNumber;
    }class ContactsManager {
        // Fields:
        Contact [] myFriends;
        int friendsCount;

        // Constructor:
        ContactsManager(){
            friendsCount = 0;
            myFriends = new Contact[500];
        }

        // Methods:
        void addContact(Contact contact){
            myFriends[friendsCount] = contact;
            friendsCount++;
        }

        Contact searchContact(String searchName){
            for(int i=0; i<friendsCount; i++){
                if(myFriends[i].name.equals(searchName)){
                    return myFriends[i];
                }
            }
            return null;
        }
    }class Main {
        public static void main(String [] args){
            ContactManager myContactManager = new ContactManager();
            Contact firendJames = newContact();

        }
    }
}